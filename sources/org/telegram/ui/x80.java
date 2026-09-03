package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class x80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39922a;
    public final LaunchActivity f39923b;

    public x80(LaunchActivity launchActivity, int i10) {
        this.f39922a = i10;
        this.f39923b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39922a;
        LaunchActivity launchActivity = this.f39923b;
        switch (i10) {
            case 0:
                launchActivity.f31624t0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
