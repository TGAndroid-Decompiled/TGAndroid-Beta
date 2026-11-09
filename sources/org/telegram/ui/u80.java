package org.telegram.ui;

import android.view.View;
public final class u80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f50318a;

    public u80(LaunchActivity launchActivity) {
        this.f50318a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f50318a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41266c1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f50318a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41266c1);
    }
}
