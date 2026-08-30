package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class v80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39100a;
    public final LaunchActivity f39101b;

    public v80(LaunchActivity launchActivity, int i10) {
        this.f39100a = i10;
        this.f39101b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f39100a;
        LaunchActivity launchActivity = this.f39101b;
        switch (i10) {
            case 0:
                launchActivity.f31650t0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
