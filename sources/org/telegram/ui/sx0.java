package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41544a;
    public final ProfileActivity f41545b;

    public sx0(ProfileActivity profileActivity, int i10) {
        this.f41544a = i10;
        this.f41545b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41544a) {
            case 0:
                this.f41545b.f33746y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f41545b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41545b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f41545b.l5(true);
                return;
        }
    }
}
