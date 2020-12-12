package org.acme.service;

import java.util.List;
import org.acme.domain.dto.UserDTO;

public interface UserService {
  List<UserDTO> findAll();
}
