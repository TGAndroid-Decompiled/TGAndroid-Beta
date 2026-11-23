package org.telegram.ui;

import android.view.View;
public final class u80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f52582a;

    public u80(LaunchActivity launchActivity) {
        this.f52582a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f52582a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f43194d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f52582a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f43194d1);
    }
}
