package com.cjs.automationtestsample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*private String arg;
    private static FormatValidator emailFormatValidator;
    private Boolean expectedValidation;

    public ExampleUnitTest(String str, Boolean expectedValidation) {
        this.arg = str;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize() {
        emailFormatValidator = new FormatValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"javacodegeeks@gmail.com.2j", false},    // it's not allowed to have a digit in the second level tld
                {"java@java@oracle.com", false},         // you cannot have @ twice in the address
                {"java!!!@example.com", false},          // you cannot the have special character '!' in the address
                {"mysite@.com", false},                  // tld cannot start with a dot
                {"javacodegees.com", false},             // must contain a @ character and a tld
                {".javacodegees.com@at.com", false},     // the address cannot start with a dot
                {"javacodegees..javacom@at.com", false}, // you cannot have double dots in your address


                {"javacodegeeks@gmail.com", true},
                {"nikos+mylist@gmail.com", true},
                {"abc.efg-900@gmail-list.com", true},
                {"abc123@example.com.gr", true}};

        return Arrays.asList(data);
    }

    @Test
    public void test() {
        Boolean res = emailFormatValidator.validate(this.arg);
        String validv = (res) ? "valid" : "invalid";
        System.out.println("Hex Color Code " + arg + " is " + validv);
        assertEquals("Result", this.expectedValidation, res);

    }
*/

    public class EmailValidatorTest {

        @Test
        public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
            assertThat(new FormatValidator().validate("name@email.com"), is(true));
        }

    }
}