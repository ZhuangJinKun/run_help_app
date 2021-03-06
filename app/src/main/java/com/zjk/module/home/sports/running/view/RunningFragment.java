package com.zjk.module.home.sports.running.view;

import com.zjk.common.data.DefSports;
import com.zjk.common.ui.BaseActivity;
import com.zjk.module.home.sports.base.view.BaseSportsFragment;

/**
 * Created by pandengzhe on 2018/3/31.
 */

public class RunningFragment extends BaseSportsFragment {

    private static final String TAG = "RunningFragment";

    public static RunningFragment newInstance(BaseActivity activity) {
        RunningFragment fragment = new RunningFragment();
        fragment.setActivity(activity);
        fragment.setType(DefSports.RUNNING);
        return fragment;
    }

    public RunningFragment() {

    }
}
