package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41552a;
    public final ProfileActivity f41553b;

    public sx0(ProfileActivity profileActivity, int i10) {
        this.f41552a = i10;
        this.f41553b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41552a) {
            case 0:
                this.f41553b.f33756y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f41553b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41553b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f41553b.l5(true);
                return;
        }
    }
}
