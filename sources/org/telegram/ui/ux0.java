package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ux0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39017a;
    public final ProfileActivity f39018b;

    public ux0(ProfileActivity profileActivity, int i10) {
        this.f39017a = i10;
        this.f39018b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39017a) {
            case 0:
                ProfileActivity profileActivity = this.f39018b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f39018b.f32168u0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f39018b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f39018b.l5(true);
                return;
        }
    }
}
