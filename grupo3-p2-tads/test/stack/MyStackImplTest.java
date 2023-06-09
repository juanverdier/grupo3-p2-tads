package stack;


import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.exceptions.EmptyStackException;
import uy.edu.um.prog2.adt.stack.MyStack;
import uy.edu.um.prog2.adt.stack.MyStackImpl;

import static org.junit.jupiter.api.Assertions.*;

class MyStackImplTest {

    @Test
    void flujoPrincipal() {

        MyStack<Integer> stackTest = new MyStackImpl<>();

        stackTest.push(5);
        stackTest.push(9);
        stackTest.push(13);
        stackTest.push(17);

        try {
            Integer top = stackTest.top();
            assertEquals(17,top);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }

        try {
            Integer eliminado = stackTest.pop();
            assertEquals(17,eliminado);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }

        assertFalse(stackTest.isEmpty());

        stackTest.makeEmpty();

        assertTrue(stackTest.isEmpty());

    }
}