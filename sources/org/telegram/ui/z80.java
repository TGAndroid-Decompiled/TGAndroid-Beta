package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class z80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40390a;
    public final LaunchActivity f40391b;

    public z80(LaunchActivity launchActivity, int i10) {
        this.f40390a = i10;
        this.f40391b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40390a;
        LaunchActivity launchActivity = this.f40391b;
        switch (i10) {
            case 0:
                launchActivity.f31128w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
