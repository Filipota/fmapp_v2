package com.fminzynieria.fmapp_v2.service;

import com.fminzynieria.fmapp_v2.entity.GuestPostEntity;
import com.fminzynieria.fmapp_v2.form.GuestPostForm;
import com.fminzynieria.fmapp_v2.repository.GuestPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class GuestPostService {

    @Autowired
    public GuestPostRepository guestPostRepository;


    public String addNewPost(String author, String email, String content, Boolean showMail) {

        Date date = new Date();

        GuestPostEntity guestPost = new GuestPostEntity();
        guestPost.setAuthor(author);
        guestPost.setContent(content);
        guestPost.setDateTime(date);
        guestPost.setEmail(email);
        guestPost.setShowEmail(showMail);
        guestPostRepository.save(guestPost);
        return "Saved!";
    }

    public String savePost(GuestPostForm guestPostForm) {

        Date currentDate = new Date();

        GuestPostEntity guestPost = new GuestPostEntity();
        guestPost.setAuthor(guestPostForm.getAuthor());
        guestPost.setEmail(guestPostForm.getEmail());
        guestPost.setContent(guestPostForm.getContent());
        guestPost.setDateTime(currentDate);
        guestPost.setShowEmail(guestPostForm.isShowEmail());
        guestPostRepository.save(guestPost);
        return "Zapisano poprawnie!";
    }

    public List<GuestPostEntity> getAllPosts() {
        Iterable<GuestPostEntity> posts = guestPostRepository.findAll();
        List<GuestPostEntity> postList = new ArrayList<>();
        posts.forEach(p -> postList.add(p));
        Collections.sort(postList, (d1, d2) -> d2.getDateTime().compareTo(d1.getDateTime()));
        return postList;
    }
}