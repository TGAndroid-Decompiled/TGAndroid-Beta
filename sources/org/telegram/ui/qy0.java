package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41459a;
    public final ProfileActivity f41460b;

    public qy0(ProfileActivity profileActivity, int i10) {
        this.f41459a = i10;
        this.f41460b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41459a) {
            case 0:
                ProfileActivity profileActivity = this.f41460b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f41460b.f34213x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f41460b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f41460b.l5(true);
                return;
        }
    }
}
