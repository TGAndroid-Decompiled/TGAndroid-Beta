package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43451a;
    public final ProfileActivity f43452b;

    public wx0(ProfileActivity profileActivity, int i10) {
        this.f43451a = i10;
        this.f43452b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43451a) {
            case 0:
                this.f43452b.f34054y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f43452b;
                profileActivity.getClass();
                profileActivity.L4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f43452b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.p5(true);
                return;
            default:
                this.f43452b.p5(true);
                return;
        }
    }
}
