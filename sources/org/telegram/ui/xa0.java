package org.telegram.ui;

import android.view.View;
public final class xa0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f39887a;

    public xa0(LaunchActivity launchActivity) {
        this.f39887a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f39887a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31615a1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f39887a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31615a1);
    }
}
