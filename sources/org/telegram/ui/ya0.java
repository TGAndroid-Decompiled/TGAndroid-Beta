package org.telegram.ui;

import android.view.View;
public final class ya0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f43585a;

    public ya0(LaunchActivity launchActivity) {
        this.f43585a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f43585a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f34137a1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f43585a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f34137a1);
    }
}
