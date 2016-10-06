package com.cjs.automationtestsample;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by CJS on 06-10-2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    private static final String USERNAME_EMAIL = "cjsaranya@gmail.com";
    private static final String PASSWORD="admin123";


    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void sayHello(){


        // Types a message into a EditText element.

        onView(withId(R.id.edt_username))
                .perform(click(),typeText(USERNAME_EMAIL), closeSoftKeyboard());

        onView(withId(R.id.edt_password))
                .perform(click(),typeText(PASSWORD), closeSoftKeyboard());

        onView(withText("Log In")).perform(click());


    }
}
