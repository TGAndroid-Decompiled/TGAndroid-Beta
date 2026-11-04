package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
public final class st0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49618a;
    public final ProfileActivity f49619b;

    public st0(ProfileActivity profileActivity, int i3) {
        this.f49618a = i3;
        this.f49619b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f49618a;
        ProfileActivity profileActivity = this.f49619b;
        switch (i3) {
            case 0:
                profileActivity.f41890y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                profileActivity.X4(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF2 = ProfileActivity.T6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.L5(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.T6;
                profileActivity.L5(true);
                return;
        }
    }
}
