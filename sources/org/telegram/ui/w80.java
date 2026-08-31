package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class w80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42408a;
    public final LaunchActivity f42409b;

    public w80(LaunchActivity launchActivity, int i10) {
        this.f42408a = i10;
        this.f42409b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f42408a;
        LaunchActivity launchActivity = this.f42409b;
        switch (i10) {
            case 0:
                launchActivity.f34172t0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
