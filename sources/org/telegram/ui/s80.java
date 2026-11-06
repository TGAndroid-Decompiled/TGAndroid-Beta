package org.telegram.ui;

import android.view.View;
public final class s80 implements View.OnAttachStateChangeListener {
    public final LaunchActivity f49682a;

    public s80(LaunchActivity launchActivity) {
        this.f49682a = launchActivity;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        LaunchActivity launchActivity = this.f49682a;
        launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.f41256c1);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        LaunchActivity launchActivity = this.f49682a;
        launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.f41256c1);
    }
}
