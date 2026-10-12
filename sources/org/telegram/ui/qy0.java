package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41455a;
    public final ProfileActivity f41456b;

    public qy0(ProfileActivity profileActivity, int i10) {
        this.f41455a = i10;
        this.f41456b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41455a) {
            case 0:
                ProfileActivity profileActivity = this.f41456b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f41456b.f34211x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41456b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f41456b.l5(true);
                return;
        }
    }
}
