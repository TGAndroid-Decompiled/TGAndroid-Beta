package org.telegram.ui;

import android.view.View;
public final class v80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f50654a;

    public v80(LaunchActivity launchActivity) {
        this.f50654a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f50654a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41257c1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f50654a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41257c1);
    }
}
