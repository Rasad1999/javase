package test;

import lombok.Data;

@Data
public class Person implements Animal{
    @Override
    public void eat() {
        System.out.println("eat rice");
    }
}
