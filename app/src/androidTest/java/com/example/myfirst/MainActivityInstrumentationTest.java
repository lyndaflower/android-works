package com.example.myfirst;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.myfirst.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
    }
    @Test
    public void locationIsSentToAppActivity() {
        String location = "Nairobi";
        onView(withId(R.id.locationEditText)).perform(typeText(location));
        onView(withId(R.id.findButton)).perform(click());
        onView(withId(R.id.locationTextView)).check(matches
                (withText("challenger : " + location)));
    }
}