package org.acme.interfaces;

import lombok.val;
import org.acme.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@RestController
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity listUser() {
    val userDTOList = userService.findAll();
    if (!userDTOList.isEmpty()) {
      return new ResponseEntity(userDTOList, HttpStatus.OK);
    }
    return new ResponseEntity(null, HttpStatus.NO_CONTENT);
  }
}
