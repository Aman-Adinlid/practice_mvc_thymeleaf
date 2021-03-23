package lexicon.se.practice.controller;

import lexicon.se.practice.dto.FriendList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Controller
public class FriendListController {

     List<FriendList>friendLists = new ArrayList<>();

    @PostConstruct
    public void init(){
        if(friendLists == null) friendLists= new ArrayList<>();
        FriendList friendList = new FriendList();
        friendList.setId(1);
        friendList.setName("David");


        FriendList friendList2 = new FriendList();
        friendList2.setId(2);
        friendList2.setName("Adam");

        FriendList friendList3 = new FriendList();
        friendList3.setId(3);
        friendList3.setName("Sara");

        friendLists.add(friendList);
        friendLists.add(friendList2);
        friendLists.add(friendList3);

    }

    @GetMapping("/list")
    public String getAllFriendLists(Model model){
        model.addAttribute("friendLists",friendLists);
        return "friendList";
    }
}


