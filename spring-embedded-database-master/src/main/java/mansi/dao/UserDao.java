package mansi.dao;

import java.util.List;

import mansi.model.User;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}