package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class z80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40406a;
    public final LaunchActivity f40407b;

    public z80(LaunchActivity launchActivity, int i10) {
        this.f40406a = i10;
        this.f40407b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40406a;
        LaunchActivity launchActivity = this.f40407b;
        switch (i10) {
            case 0:
                launchActivity.f31142w0.invalidate();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                launchActivity.z0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
