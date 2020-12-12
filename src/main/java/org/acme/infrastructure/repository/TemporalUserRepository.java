package org.acme.infrastructure.repository;

import java.util.Arrays;
import java.util.List;
import lombok.experimental.UtilityClass;
import org.acme.domain.entity.User;

@UtilityClass
public class TemporalUserRepository {
  public static List<User> listUser() {
    return Arrays.asList(
        User.builder().id(1).username("Jhooomn").password("1234").build(),
        User.builder().id(2).username("BadUser").password("brasil").build(),
        User.builder().id(3).username("CrackerBad").password("c++").build(),
        User.builder().id(4).username("git").password("java").build());
  }
}
