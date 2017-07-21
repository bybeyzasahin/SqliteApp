package com.example.fragment;

/**
 * Created by Beyza on 20.07.2017.
 */

public class Ipsum {

    static String[] Headlines = {
            "FRAGMENT 1",
            "FRAGMENT 2"
    };

    static String[] Articles = {
            "FRAGMENT 1\n\nFragment represents a behavior or a portion of user interface in an Activity. You can combine multiple fragments in a single activity to build a multi-pane UI and reuse a fragment in multiple activities. You can think of a fragment as a modular section of an activity, which has its own lifecycle, receives its own input events, and which you can add or remove while the activity is running (sort of like a \"sub activity\" that you can reuse in different activities).",
            "FRAGMENT 2\n\nA fragment must always be embedded in an activity and the fragment's lifecycle is directly affected by the host activity's lifecycle. For example, when the activity is paused, so are all fragments in it, and when the activity is destroyed, so are all fragments. However, while an activity is running (it is in the resumed lifecycle state), you can manipulate each fragment independently, such as add or remove them. When you perform such a fragment transaction, you can also add it to a back stack that's managed by the activity—each back stack entry in the activity is a record of the fragment transaction that occurred. The back stack allows the user to reverse a fragment transaction (navigate backwards), by pressing the Back button."
    };
}
