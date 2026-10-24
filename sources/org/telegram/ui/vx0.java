package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class vx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42836a;
    public final ProfileActivity f42837b;

    public vx0(ProfileActivity profileActivity, int i10) {
        this.f42836a = i10;
        this.f42837b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42836a) {
            case 0:
                this.f42837b.f34056y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                ProfileActivity profileActivity = this.f42837b;
                profileActivity.getClass();
                profileActivity.L4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f42837b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.p5(true);
                return;
            default:
                this.f42837b.p5(true);
                return;
        }
    }
}
