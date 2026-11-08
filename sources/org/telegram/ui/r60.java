package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49393a;
    public final LaunchActivity f49394b;

    public r60(LaunchActivity launchActivity, int i7) {
        this.f49393a = i7;
        this.f49394b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f49393a;
        LaunchActivity launchActivity = this.f49394b;
        switch (i7) {
            case 0:
                launchActivity.f41291u0.invalidate();
                return;
            default:
                String str = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
