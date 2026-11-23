package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51637a;
    public final LaunchActivity f51638b;

    public r60(LaunchActivity launchActivity, int i7) {
        this.f51637a = i7;
        this.f51638b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f51637a;
        LaunchActivity launchActivity = this.f51638b;
        switch (i7) {
            case 0:
                launchActivity.f43226v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
