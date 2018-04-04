package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
*Created by Bentley on 04/04/18
*/

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @OneToOne(mappedBy = "authors")
    private Set<Book> publishedbooks = new HashSet<>();

    public Publisher(){
        }

    public Publisher(String name, String address){
        this.name = name;
        this.address = address;


    }

    public Publisher(String name, String address, Set<Book> books) {
        this.name = name;
        this.address = address;
        this.publishedbooks = books;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Set<Book> getPublishedbooks() {
        return publishedbooks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPublishedbooks(Set<Book> publishedbooks) {
        this.publishedbooks = publishedbooks;
    }
}