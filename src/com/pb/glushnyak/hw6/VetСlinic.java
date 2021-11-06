package com.pb.glushnyak.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main (String[] args) throws Exception{
        Animal [] an = new Animal[]{new Cat(),new Dog(), new Horse()};
        Veterinarian mm = new Veterinarian();

        for (Animal jj: an){
            Class clazz = Class.forName("com.pb.glushnyak.hw6.Veterinarian");

            Constructor constr = clazz.getConstructor(new Class[] {});
            Object obj = constr.newInstance();
            if (obj instanceof Veterinarian) {
                ((Veterinarian) obj).treatAnimal(jj);
            }

        }



}
}

