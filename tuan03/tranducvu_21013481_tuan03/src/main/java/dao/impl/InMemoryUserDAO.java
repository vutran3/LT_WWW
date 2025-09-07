package dao.impl;

import dao.UserDAO;
import entities.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryUserDAO implements UserDAO {
    private final List<User> users = new CopyOnWriteArrayList<>();
    @Override public void add(User u) { users.add(u); }
    @Override public List<User> findAll() { return users; }
}
