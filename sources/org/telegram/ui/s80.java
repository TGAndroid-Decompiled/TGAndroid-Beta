package org.telegram.ui;

import android.view.View;
public final class s80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f49661a;

    public s80(LaunchActivity launchActivity) {
        this.f49661a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f49661a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41231c1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f49661a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41231c1);
    }
}
