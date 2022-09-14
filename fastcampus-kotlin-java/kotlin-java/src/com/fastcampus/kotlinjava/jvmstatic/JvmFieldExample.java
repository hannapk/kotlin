package com.fastcampus.kotlinjava.jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {

        // JvmFiledClass.Companion.getId();
        // JvmFieldObject.INSTANCE.getName();
        //
        // int code = JvmFieldClass.CODE;
        // String familyName = JvmFieldObject.FAMILY_NAME;

        int id = JvmFieldClass.id;

        String name = JvmFieldObject.name;


        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
