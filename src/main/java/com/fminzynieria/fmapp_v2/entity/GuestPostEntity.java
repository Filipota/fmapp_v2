package com.fminzynieria.fmapp_v2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "GUEST_BOOK")
public class GuestPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "author")
    private String author;
    @Column(name = "content", length = 1000)
    private String content;
    @Column(name = "datetime", columnDefinition="DATETIME")
    private Date dateTime;
    @Column(name = "email")
    private String email;
    @Column(name = "showemail")
    private boolean showEmail;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isShowEmail() {
        return showEmail;
    }

    public void setShowEmail(boolean showEmail) {
        this.showEmail = showEmail;
    }
}