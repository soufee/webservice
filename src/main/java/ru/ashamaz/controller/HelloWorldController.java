package ru.ashamaz.controller;

import com.google.common.base.Preconditions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ashamaz.model.User;

@RestController
@RequestMapping(value = "/rest")
public class HelloWorldController {
    static final Logger log = LogManager.getLogger(HelloWorldController.class);

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getHello(
            @RequestParam(value = "nickname", required = true) String nickname,
            @RequestParam(value = "age", required = false) String age
    ) {
        log.info("Попали в getHello");
        User myResult = null;
        if (age != null && age.matches("[-+]?\\d+")) {
            myResult = new User(nickname, Integer.parseInt(age));
        } else {
            log.info("age is empty or not digit = "+age);
            myResult = new User(nickname, 0);
        }
        log.info("Generated " + myResult);
        return myResult;
    }

    @ResponseBody
    @RequestMapping(value = "/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user){
        Preconditions.checkNotNull(user, "user is required");
        User created = new User(user.getNickname(), user.getAge());
        log.info("Created user "+created);
        return created;
    }
}
