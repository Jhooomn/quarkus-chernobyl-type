package org.acme.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.val;
import org.acme.application.assembler.AssemblerUser;
import org.acme.domain.dto.UserDTO;
import static org.acme.infrastructure.repository.TemporalUserRepository.listUser;
import org.acme.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserService implements UserService {

  @Override
  public List<UserDTO> findAll() {
    val userList = listUser();
    if (userList.isEmpty()) {
      return Collections.emptyList();
    }
    try {
      return userList.parallelStream()
          .filter(user -> !Objects.isNull(user))
          .map(AssemblerUser::domainToDto)
          .collect(Collectors.toList());
    } catch (Exception e) {
      return Collections.emptyList();
    }
  }
}
