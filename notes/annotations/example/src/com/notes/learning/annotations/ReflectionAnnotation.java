package com.notes.learning.annotations;

import java.lang.reflect.Field;

public class ReflectionAnnotation {
    public void Apply(final Object object) {
        final Class<?> clazz = object.getClass();
        final Field[] fields = clazz.getDeclaredFields(); // Capturar os atributos realizando reflection

        for(Field field : fields) {
            if(field.isAnnotationPresent(ExampleIntNumber.class)) { // Verifica se a annotation está presente em algum atributo
                final ExampleIntNumber annotation = field.getAnnotation(ExampleIntNumber.class); // Pega a annotation
                final String type = annotation.type().toString(); // Pegar o valor da tipo enumerado
                if(type.equals("PAIR"))
                    System.out.println("Have to check if it's an even number!");
                else if(type.equals("ODD"))
                    System.out.println("Have to check if it is an odd number!");

                try {
                    field.setAccessible(true); // Libera o acesso de atributo caso seja privado
                    final Integer attributeValue = (Integer) field.get(object); // Pega valor do atributo usando reflection

                    Check(attributeValue);
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void Check(final Integer attributeValue) {
        if(attributeValue % 2 == 0)
            System.out.println("This number is Pair!");
        else
            System.out.println("This number is Odd!");
    }
}
