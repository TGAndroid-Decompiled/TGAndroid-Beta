package org.telegram.ui;

import android.view.View;
public final class v80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f52736a;

    public v80(LaunchActivity launchActivity) {
        this.f52736a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f52736a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f43084d1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f52736a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f43084d1);
    }
}
