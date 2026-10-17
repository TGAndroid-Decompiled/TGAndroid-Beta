package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ux0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42067a;
    public final ProfileActivity f42068b;

    public ux0(ProfileActivity profileActivity, int i10) {
        this.f42067a = i10;
        this.f42068b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42067a) {
            case 0:
                this.f42068b.f33740y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f42068b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f42068b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f42068b.l5(true);
                return;
        }
    }
}
