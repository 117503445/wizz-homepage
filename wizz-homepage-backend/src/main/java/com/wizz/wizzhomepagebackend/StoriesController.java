package com.wizz.wizzhomepagebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/api/stories")
public class StoriesController {
    @Autowired
    private StoriesRepository storiesRepository;

    @PostMapping(path = "")
    public @ResponseBody
    PostResult addNewStories(@RequestParam long time, @RequestParam String name, @RequestParam String storyDescribe) {
        Stories story = new Stories(time, name, storyDescribe);
        storiesRepository.save(story);
        return new PostResult("Story Saved", story.getId());
    }

    @GetMapping(path = "")
    public @ResponseBody
    Iterable<Stories> getAllStories() {
        return storiesRepository.findAll();
    }

    @GetMapping(path = "{id}")
    public @ResponseBody
    Object getOneStory(@PathVariable int id, HttpServletResponse response) {
        var story = storiesRepository.findById(id);
        if (story.isPresent()) {
            return story.get();
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);//设置状态码
            return String.format("Story %d Not Found", id);
        }
    }
}
