package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49371a;
    public final LaunchActivity f49372b;

    public r60(LaunchActivity launchActivity, int i7) {
        this.f49371a = i7;
        this.f49372b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f49371a;
        LaunchActivity launchActivity = this.f49372b;
        switch (i7) {
            case 0:
                launchActivity.f41263u0.invalidate();
                return;
            default:
                String str = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
