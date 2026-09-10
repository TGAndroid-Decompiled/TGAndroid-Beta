package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36794a;
    public final ProfileActivity f36795b;

    public sy0(ProfileActivity profileActivity, int i10) {
        this.f36794a = i10;
        this.f36795b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36794a) {
            case 0:
                ProfileActivity profileActivity = this.f36795b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f36795b.f30512x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36795b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f36795b.l5(true);
                return;
        }
    }
}
