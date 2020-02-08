package test;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public
class Team {
    @Id
    @Column(name="tid")
    private String tid;
    @Column(name="teamname")
    private String teamname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "team")
    private List<Idol> idol;

    // getter and setter
    public String getTid() {
        return tid;
    }
    public void setTid(final String tid) {
        this.tid = tid;
    }
    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(final String teamname) {
        this.teamname = teamname;
    }
}