package org.telegram.ui;

import android.view.View;
public final class u80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f52470a;

    public u80(LaunchActivity launchActivity) {
        this.f52470a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f52470a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f43074d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f52470a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f43074d1);
    }
}
