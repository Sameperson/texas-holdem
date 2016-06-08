package com.sameperson.texasholdem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LeaderboardController {

    @RequestMapping(value = "/leaderboardJSON")
    @ResponseBody
    public String home(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        System.out.println("hi from leaderboard controller");
        return "[\n" +
                "  {\n" +
                "   \"name\" : \"John\",\n" +
                "   \"score\" : 5126\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Eddie\",\n" +
                "   \"score\" : 4915\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Sam\",\n" +
                "   \"score\" : 4903\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Emma\",\n" +
                "   \"score\" : 4600\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Bill\",\n" +
                "   \"score\" : 4296\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Kait\",\n" +
                "   \"score\" : 3850\n" +
                "  },\n" +
                "  {\n" +
                "   \"name\" : \"Anna\",\n" +
                "   \"score\" : 3118\n" +
                "  }\n" +
                "]";
    }

}
