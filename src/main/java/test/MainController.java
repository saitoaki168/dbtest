package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.Idol;
import test.repository.IdolRepository;
import test.repository.IdolService;


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

        @RequestMapping(method = RequestMethod.GET)
        public String search() {
            return "search";
        }


        @RequestMapping(method = RequestMethod.POST)
        private ModelAndView search(ModelAndView mav
            , @RequestParam("title") String title, @RequestParam("name") String name, @RequestParam("genre") String genre, @RequestParam("arrival") Integer arrival) {
            mav.setViewName("search");
            mav.addObject("title", title);
            mav.addObject("name", name);
            mav.addObject("genre", genre);
            mav.addObject("arrival", arrival);
            List<Idol> result = service.search(title, name, genre, arrival);
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

}

