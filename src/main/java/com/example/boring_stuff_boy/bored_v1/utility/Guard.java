package com.example.boring_stuff_boy.bored_v1.utility;

/**
 * @author juancamiloguzmantoro
 *  utility checking class
 * */
public class Guard {
    public static <T extends  Exception>void throwIf(boolean condition, T exception) throws  T{
        if(condition){
            throw exception;
        }
    }
}
