package com.example.myfirst;


import android.view.View;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.myfirst.ui.RestaurantListActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;

@RunWith(AndroidJUnit4.class)
public class AppActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<RestaurantListActivity> activityTestRule =
            new ActivityTestRule<>(RestaurantListActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectApp(){
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
        String restaurantName = "Mi Mero Mole";
        onData(anything())
                .inAdapterView(withId(R.id.listView))
                .atPosition(0)
                .perform(click());
                onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
                        .check(matches(withText(restaurantName)));
    }
}