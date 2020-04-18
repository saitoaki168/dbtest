package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.repository.IdolRepository;
import test.repository.TeamRepository;
import test.repository.service.IdolService;

@ComponentScan
@Controller

public class MainController {

        @Autowired
        IdolRepository repository;
        
        @RequestMapping("/")
        public String index() {
            return "index";
        }

        @RequestMapping("/map")
        public String map() {
            return "map";
        }

        @Autowired
        public IdolService service;

        @RequestMapping(value="/search", method = RequestMethod.GET)
            public String check() {
                return "/search";
            }

        @RequestMapping(value="/search", method = RequestMethod.POST)
        public ModelAndView search(ModelAndView mav, @RequestParam("genre") String genre, @RequestParam("arrival") String arrival) {
            mav.setViewName("search");
            mav.addObject("genre", genre);
            mav.addObject("arrival", arrival);
            List<Idol> result = service.search(genre, arrival);
            mav.addObject("result", result);
            mav.addObject("resultSize", result.size());
            return mav;
        }

        @RequestMapping("/show")
        private ModelAndView index(ModelAndView mav) {
            mav.setViewName("show");
            Iterable<Idol> list = repository.findAll();
            mav.addObject("data", list);
            return mav;
        }

        @Autowired
        TeamRepository trepository;

        @RequestMapping("/genresearch")
        private ModelAndView genresearch(ModelAndView mav) {
            mav.setViewName("genresearch");
            Iterable<Team> list = trepository.findAll();

            Iterable<Idol> ilist = repository.findAll();
            mav.addObject("idata", ilist);
            mav.addObject("data", list);
            return mav;
        }

        @GetMapping("new")
        public String newIdol(@ModelAttribute("idol") Idol idol, Model model) {
            return "new";
        }
        
        @PostMapping
        public String create(@ModelAttribute("idol") @Validated Idol idol, BindingResult result, Model model) {
          if (result.hasErrors()) {
            return "new";
          } else {
            IdolService.save(idol);
            return "redirect:/idol";
          }
        }
}
