package faqih.belajar.unit.test;

import faqih.belajar.unit.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest{


    @Test
    void testRandom(Random random, TestInfo info) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(value = 10, name = "{displayName}")
    void testRandomRepeat(Random random, TestInfo info, RepetitionInfo repetitionInfo) {
        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 45, 34, 56})
    void testWithParameter(int value){
        var expected = value + value;
        var result = Calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }

    public static List<Integer> parameterSource(){
        return List.of(1,2,34,56,33,65,67,35);
    }

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithMethodSource(Integer value){
        var expected = value + value;
        var result = Calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }
}
