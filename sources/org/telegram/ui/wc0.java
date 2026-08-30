package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f39394a;
    public final float[] f39395b = {0.0f, 1.0f};
    public final FrameLayout f39396c;
    public final xc0 d;

    public wc0(xc0 xc0Var, FrameLayout frameLayout) {
        this.d = xc0Var;
        this.f39396c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f39395b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f39394a) {
            xc0 xc0Var = this.d;
            ad0 ad0Var = xc0Var.f39896b;
            ad0 ad0Var2 = xc0Var.f39896b;
            if (ad0Var.f32536l0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ad0Var2.f32536l0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(ad0Var2.f32536l0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(ad0Var2.f32536l0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f39394a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.nr.f27347g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.nr.f27347g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.nr.f27347g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f39396c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
