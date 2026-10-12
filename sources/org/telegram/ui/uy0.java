package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class uy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40833a;
    public final ProfileActivity f40834b;

    public uy0(ProfileActivity profileActivity, int i10) {
        this.f40833a = i10;
        this.f40834b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40833a) {
            case 0:
                ProfileActivity profileActivity = this.f40834b;
                profileActivity.getClass();
                profileActivity.J4(valueAnimator.getAnimatedFraction());
                return;
            case 1:
                this.f40834b.f32691x0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f40834b;
                View view = profileActivity2.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity2.l5(true);
                return;
            default:
                this.f40834b.l5(true);
                return;
        }
    }
}
