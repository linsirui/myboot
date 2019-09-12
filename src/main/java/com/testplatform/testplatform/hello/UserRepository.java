package com.testplatform.testplatform.hello;

import com.testplatform.testplatform.hello.User;
import org.springframework.data.repository.CrudRepository;

// This will be auto implemented by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Integer> {
}
