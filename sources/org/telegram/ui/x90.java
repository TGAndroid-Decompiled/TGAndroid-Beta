package org.telegram.ui;

import android.view.View;
public final class x90 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f43507a;

    public x90(LaunchActivity launchActivity) {
        this.f43507a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f43507a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f33356e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f43507a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f33356e1);
    }
}
