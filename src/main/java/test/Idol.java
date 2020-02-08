package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idol")
public class Idol {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="genre")
    private String genre;

    @Column(name="arrival")
    private String arrival;

    @Column(name="titlename")
    private String titlename;

    @Column(name="writer")
    private String writer;

    // getter and setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitlename() {
        return titlename;
    }
    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
