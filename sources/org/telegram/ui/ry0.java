package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ry0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37347a;
    public final ProfileActivity f37348b;

    public ry0(ProfileActivity profileActivity, int i10) {
        this.f37347a = i10;
        this.f37348b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37347a) {
            case 0:
                ProfileActivity profileActivity = this.f37348b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f37348b.f31417x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37348b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f37348b.l5(true);
                return;
        }
    }
}
