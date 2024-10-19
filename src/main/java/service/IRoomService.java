package service;

import model.Room;

import java.util.List;

public interface IRoomService<E>{
    boolean add(E e);

    boolean edit(Room room, int id);

    boolean delete(int id);

    Room findById(int id);

    List<E> findAll();
    void edit(int id, E e);
}
