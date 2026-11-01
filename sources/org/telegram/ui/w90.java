package org.telegram.ui;

import android.view.View;
public final class w90 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f42734a;

    public w90(LaunchActivity launchActivity) {
        this.f42734a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f42734a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33363e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f42734a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33363e1);
    }
}
