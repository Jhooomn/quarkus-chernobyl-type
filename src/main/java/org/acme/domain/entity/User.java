package org.acme.domain.entity;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Serializable {
  private int id;
  private String username;
  private String password;
}
