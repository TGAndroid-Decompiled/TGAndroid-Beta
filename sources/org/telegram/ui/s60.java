package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51948a;
    public final LaunchActivity f51949b;

    public s60(LaunchActivity launchActivity, int i7) {
        this.f51948a = i7;
        this.f51949b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f51948a;
        LaunchActivity launchActivity = this.f51949b;
        switch (i7) {
            case 0:
                launchActivity.f43151v0.invalidate();
                return;
            default:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
