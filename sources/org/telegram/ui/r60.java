package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49390a;
    public final LaunchActivity f49391b;

    public r60(LaunchActivity launchActivity, int i7) {
        this.f49390a = i7;
        this.f49391b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f49390a;
        LaunchActivity launchActivity = this.f49391b;
        switch (i7) {
            case 0:
                launchActivity.f41287u0.invalidate();
                return;
            default:
                String str = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
