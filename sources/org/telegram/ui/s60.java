package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51917a;
    public final LaunchActivity f51918b;

    public s60(LaunchActivity launchActivity, int i7) {
        this.f51917a = i7;
        this.f51918b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f51917a;
        LaunchActivity launchActivity = this.f51918b;
        switch (i7) {
            case 0:
                launchActivity.f43116v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
