package com.droidfeed;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.ViewAction;

import com.droidfeed.ui.module.main.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)

public class FirstTest {

    @Before
    public void startApp() {
        ActivityScenario<MainActivity> rule = ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void firstTest() {
        onView(withId(R.id.btnMenu)).perform(click());
    }

}
