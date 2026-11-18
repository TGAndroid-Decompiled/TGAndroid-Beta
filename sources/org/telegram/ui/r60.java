package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51514a;
    public final LaunchActivity f51515b;

    public r60(LaunchActivity launchActivity, int i7) {
        this.f51514a = i7;
        this.f51515b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f51514a;
        LaunchActivity launchActivity = this.f51515b;
        switch (i7) {
            case 0:
                launchActivity.f43106v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
