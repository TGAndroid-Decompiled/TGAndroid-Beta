package org.telegram.ui;

import android.view.View;
public final class v80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f52711a;

    public v80(LaunchActivity launchActivity) {
        this.f52711a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f52711a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f43074d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f52711a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f43074d1);
    }
}
