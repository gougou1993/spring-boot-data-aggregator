package org.feego.spring.example.aggregate;

import org.feego.spring.annotation.DataBeanConsumer;
import org.feego.spring.annotation.DataBeanProvider;
import org.feego.spring.example.model.Post;
import org.feego.spring.example.model.User;
import org.feego.spring.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lvyahui (lvyahui8@gmail.com,lvyahui8@126.com)
 * @since 2019/6/2 16:42
 */
@Component
public class UserAggregate {
    private UserService userService;

    @DataBeanProvider(id="userWithPosts",namespace = "feego.example")
    public User userWithPosts(
            @DataBeanConsumer(id = "user",namespace = "feego.example") User user,
            @DataBeanConsumer(id = "posts",namespace = "feego.example") List<Post> posts) {
        user.setPosts(posts);
        return user;
    }
}
