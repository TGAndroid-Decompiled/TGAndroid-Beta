package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41549a;
    public final ProfileActivity f41550b;

    public sx0(ProfileActivity profileActivity, int i10) {
        this.f41549a = i10;
        this.f41550b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41549a) {
            case 0:
                this.f41550b.f33753y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f41550b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41550b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f41550b.l5(true);
                return;
        }
    }
}
