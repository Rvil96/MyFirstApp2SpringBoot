package web.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @NotEmpty(message = "Name can't be empty")
    @Size(min = 2, max = 24, message = "Min size name 2, max size name 24")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Does not correspond to the format")
    private String name;
    @Column(name = "surname")
    @NotEmpty(message = "Surname can't be empty")
    @Size(min = 2, max = 24, message = "Min size surname 2, max size surname 24")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Does not correspond to the format")
    private String surname;
    @Column(name = "age")
    @Min(value = 0)
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
