package dao;

import domain.User;

import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-26.
 */
public class DaoTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        SimpleConnectionMaker simpleConnectionMaker = new SimpleConnectionMaker();
        Dao dao = new Dao(simpleConnectionMaker);
        System.out.println("connection ok..");

        User userAdd = new User();
        userAdd.setId("99");
        userAdd.setName("DI 테스트 기본");
        userAdd.setPassword("test");

        dao.add(userAdd);

        System.out.println(userAdd.getId() + "등록 성공");

        User userSelect = dao.get(userAdd.getId());
        System.out.println(userSelect.getName());
        System.out.println(userSelect.getPassword());

        System.out.println(userSelect.getId() + "조회 성공");
    }
}
