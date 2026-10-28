package org.telegram.ui;

import android.view.View;
public final class ra0 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f42901a;

    public ra0(LaunchActivity launchActivity) {
        this.f42901a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f42901a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f35556e1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f42901a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f35556e1);
    }
}
