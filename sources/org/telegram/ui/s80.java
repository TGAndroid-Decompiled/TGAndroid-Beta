package org.telegram.ui;

import android.view.View;
public final class s80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f51145a;

    public s80(LaunchActivity launchActivity) {
        this.f51145a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f51145a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f42629d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f51145a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f42629d1);
    }
}
