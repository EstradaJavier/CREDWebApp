package com.mycompany.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositroy  extends CrudRepository<User, Integer> {

}
