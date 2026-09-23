package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f40103a;
    public final float[] f40104b = {0.0f, 1.0f};
    public final FrameLayout f40105c;
    public final ad0 d;

    public zc0(ad0 ad0Var, FrameLayout frameLayout) {
        this.d = ad0Var;
        this.f40105c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f40104b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f40103a) {
            ad0 ad0Var = this.d;
            dd0 dd0Var = ad0Var.f31773b;
            dd0 dd0Var2 = ad0Var.f31773b;
            if (dd0Var.f32598o0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(dd0Var2.f32598o0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(dd0Var2.f32598o0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(dd0Var2.f32598o0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f40103a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.rr.f27702g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.rr.f27702g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.rr.f27702g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f40105c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
