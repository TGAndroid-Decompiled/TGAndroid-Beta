package org.telegram.ui;

import android.view.View;
public final class za0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f40432a;

    public za0(LaunchActivity launchActivity) {
        this.f40432a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f40432a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f31589a1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f40432a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f31589a1);
    }
}
