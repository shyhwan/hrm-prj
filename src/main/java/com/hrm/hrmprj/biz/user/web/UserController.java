package com.hrm.hrmprj.biz.user.web;

import com.hrm.hrmprj.biz.user.service.UserService;
import com.hrm.hrmprj.common.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/biz/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO userDTO = userService.getUserById(id);
        log.debug("userDTO :: {}", userDTO.toString());
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/userList")
    public ModelAndView getAllUsers(Model model) {
        List<UserDTO> userList = userService.getAllUsers();
        log.debug("userList :: {}", userList.toString());
        ModelAndView modelAndView = new ModelAndView("user/userList");
        modelAndView.addObject("userList", userList);
//        return ResponseEntity.ok(userDTOList);
        return modelAndView;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
        return ResponseEntity.ok().build();
    }
}
