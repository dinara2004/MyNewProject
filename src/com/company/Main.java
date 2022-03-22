package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static com.company.gender.Gender.*;
import static java.util.Objects.*;

public class Main {

    public static void main(String[] args) {
  /** !  2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
    * !  3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender,
    *    Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
    * !  4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер,
    *    бул класс биздин база данныхыбыз болот.
    * !  5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
    * !  6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык
    *    userлерди алуу.
    * !  7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке
    *    ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
    * !  8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
    * !  9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
    * !  10) Аларды биздин базага кошунуз.
    * !  11) 1 деген id менен userди таап консольго чыгарыныз.
    * !  12) Эгер ал id жок болсо анда RunTimeException кармасын.
    * !  13) Exception ди озунуздор тузунуздор.
    * !  14) Баардык userлерди консольго чыгарыныз.
    *    15) 2 деген id менен userди очурунуз.
    *    16) Баардык userлерди консольго чыгарыныз.
    */
        User user = new User("Dinara", 18, 1, WOMAN);
        User user1 = new User("Nurzhan", 25, 3, WOMAN);
        User user2 = new User("Kanat", 23, 2, MAN);
        User user3 = new User("Mukhammed", 24, 5, MAN);

        List<User> mas = new ArrayList<>(List.of(user, user1, user2));
        UserServiceImpl userService = new UserServiceImpl(user, user1, user2, new UserDao());

        userService.IDMnTabuu(mas, 1);
        System.out.println("----------------------------------------------------");
        userService.BaarynAluu(mas);
        System.out.println("----------------------------------------------------");
        userService.IDMnOchuruu(mas, 2);
        userService.BaarynAluu(mas);
        System.out.println("----------------------------------------------------");
        userService.UserdiKoshuu(mas, new User("Almaz", 20, 4, MAN));
        userService.BaarynAluu(mas);

    }
}
