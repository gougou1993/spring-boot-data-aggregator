package org.feego.spring.example.service.impl;

import org.feego.spring.annotation.DataBeanProvider;
import org.feego.spring.annotation.InvokeParameter;
import org.feego.spring.example.model.Post;
import org.feego.spring.example.service.PostService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author lvyahui (lvyahui8@gmail.com,lvyahui8@126.com)
 * @since 2019/6/2 16:54
 */
@Service
public class PostServiceImpl implements PostService {
    @DataBeanProvider(id = "posts",namespace = "feego.example")
    @Override
    public List<Post> getPosts(@InvokeParameter("userId") Long userId) {
        Post post = new Post();
        post.setTitle("spring data aggregate example");
        post.setContent("No active profile set, falling back to default profiles");
        return Collections.singletonList(post);
    }
}
