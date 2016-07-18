package com.sameperson.texasholdem.web.controller;


import com.sameperson.texasholdem.model.User;
import com.sameperson.texasholdem.service.UserService;
import com.sameperson.texasholdem.web.FlashMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public String addGif(User user, @RequestParam MultipartFile file, RedirectAttributes redirectAttributes) {
        userService.save(user, file);
        redirectAttributes.addFlashAttribute("flash", new FlashMessage("Account successfully created!", FlashMessage.Status.SUCCESS));
        return "redirect:/";
    }
}
