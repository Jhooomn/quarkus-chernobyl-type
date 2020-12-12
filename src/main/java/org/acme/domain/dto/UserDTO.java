package org.acme.domain.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO implements Serializable {
  private int id;
  private String username;
  private String password;
}
