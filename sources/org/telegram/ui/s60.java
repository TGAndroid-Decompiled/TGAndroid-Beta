package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51944a;
    public final LaunchActivity f51945b;

    public s60(LaunchActivity launchActivity, int i7) {
        this.f51944a = i7;
        this.f51945b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f51944a;
        LaunchActivity launchActivity = this.f51945b;
        switch (i7) {
            case 0:
                launchActivity.f43147v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
