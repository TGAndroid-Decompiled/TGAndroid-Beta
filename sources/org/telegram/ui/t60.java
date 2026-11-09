package org.telegram.ui;

import android.animation.ValueAnimator;
public final class t60 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50096a;
    public final LaunchActivity f50097b;

    public t60(LaunchActivity launchActivity, int i7) {
        this.f50096a = i7;
        this.f50097b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f50096a;
        LaunchActivity launchActivity = this.f50097b;
        switch (i7) {
            case 0:
                launchActivity.f41298u0.invalidate();
                return;
            default:
                String str = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
