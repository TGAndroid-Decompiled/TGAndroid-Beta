package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f43029a;
    public final float[] f43030b = {0.0f, 1.0f};
    public final FrameLayout f43031c;
    public final yc0 d;

    public xc0(yc0 yc0Var, FrameLayout frameLayout) {
        this.d = yc0Var;
        this.f43031c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f43030b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f43029a) {
            yc0 yc0Var = this.d;
            bd0 bd0Var = yc0Var.f43601b;
            bd0 bd0Var2 = yc0Var.f43601b;
            if (bd0Var.f35468l0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(bd0Var2.f35468l0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(bd0Var2.f35468l0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(bd0Var2.f35468l0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f43029a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.pr.f30184g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.pr.f30184g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.pr.f30184g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f43031c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
