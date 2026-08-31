package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42903a;
    public final ProfileActivity f42904b;

    public wx0(ProfileActivity profileActivity, int i10) {
        this.f42903a = i10;
        this.f42904b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42903a) {
            case 0:
                ProfileActivity profileActivity = this.f42904b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f42904b.f34701u0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f42904b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f42904b.l5(true);
                return;
        }
    }
}
