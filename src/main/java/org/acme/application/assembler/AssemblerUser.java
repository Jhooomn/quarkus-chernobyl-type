package org.acme.application.assembler;

import java.util.Objects;
import org.acme.domain.dto.UserDTO;
import org.acme.domain.entity.User;

public class AssemblerUser {

  public static User dtoToDomain(final UserDTO userDTO) {
    try {
      if (!Objects.isNull(userDTO)) {
        return User.builder()
            .id(userDTO.getId())
            .username(userDTO.getUsername())
            .password(userDTO.getPassword())
            .build();
      }
      return User.builder().build();
    } catch (Exception e) {
      return User.builder().build();
    }
  }

  public static UserDTO domainToDto(final User user) {
    try {
      if (!Objects.isNull(user)) {
        return UserDTO.builder()
            .id(user.getId())
            .username(user.getUsername())
            .password(user.getPassword())
            .build();
      }
      return UserDTO.builder().build();
    } catch (Exception e) {
      return UserDTO.builder().build();
    }
  }
}
