package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class zt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54025a;
    public final ProfileActivity f54026b;

    public zt0(ProfileActivity profileActivity, int i7) {
        this.f54025a = i7;
        this.f54026b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f54025a;
        ProfileActivity profileActivity = this.f54026b;
        switch (i7) {
            case 0:
                profileActivity.f43233y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.Z4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.X6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.O5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.O5(true);
                return;
        }
    }
}
