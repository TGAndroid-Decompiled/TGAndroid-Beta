package org.telegram.ui;

import android.view.View;
public final class s80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f49681a;

    public s80(LaunchActivity launchActivity) {
        this.f49681a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f49681a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41255c1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f49681a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41255c1);
    }
}
