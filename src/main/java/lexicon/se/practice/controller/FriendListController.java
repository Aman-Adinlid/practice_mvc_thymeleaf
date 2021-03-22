package lexicon.se.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendListController {

    @GetMapping("/Index")
    public String myIndexPage(){
        System.out.println("myIndexPage");
        return myIndexPage();
    }
@RequestMapping("/MyFriendList")
    public String myFriendList(Model model){
        return "MyFriendList";

}

}
