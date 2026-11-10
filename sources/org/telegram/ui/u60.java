package org.telegram.ui;

import android.animation.ValueAnimator;
public final class u60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50419a;
    public final LaunchActivity f50420b;

    public u60(LaunchActivity launchActivity, int i7) {
        this.f50419a = i7;
        this.f50420b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f50419a;
        LaunchActivity launchActivity = this.f50420b;
        switch (i7) {
            case 0:
                launchActivity.f41289u0.invalidate();
                return;
            default:
                String str = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
