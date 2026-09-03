package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.regex.Pattern;
public final class w80 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42378a;
    public final LaunchActivity f42379b;

    public w80(LaunchActivity launchActivity, int i10) {
        this.f42378a = i10;
        this.f42379b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f42378a;
        LaunchActivity launchActivity = this.f42379b;
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
