package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yc0 implements ValueAnimator.AnimatorUpdateListener {
    public boolean f40228a;
    public final float[] f40229b = {0.0f, 1.0f};
    public final FrameLayout f40230c;
    public final zc0 d;

    public yc0(zc0 zc0Var, FrameLayout frameLayout) {
        this.d = zc0Var;
        this.f40230c = frameLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        float lerp = AndroidUtilities.lerp(this.f40229b, valueAnimator.getAnimatedFraction());
        if (lerp >= 0.7f && !this.f40228a) {
            zc0 zc0Var = this.d;
            cd0 cd0Var = zc0Var.f40444b;
            cd0 cd0Var2 = zc0Var.f40444b;
            if (cd0Var.f33098l0 != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(cd0Var2.f33098l0, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(cd0Var2.f33098l0, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(cd0Var2.f33098l0, View.ALPHA, 0.0f, 1.0f));
                animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.f40228a = true;
            }
        }
        if (lerp <= 0.5f) {
            interpolation = org.telegram.ui.Components.mr.f27123g.getInterpolation(lerp / 0.5f) * 1.1f;
        } else if (lerp <= 0.75f) {
            interpolation = 1.1f - (org.telegram.ui.Components.mr.f27123g.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
        } else {
            interpolation = (org.telegram.ui.Components.mr.f27123g.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        FrameLayout frameLayout = this.f40230c;
        frameLayout.setScaleX(interpolation);
        frameLayout.setScaleY(interpolation);
    }
}
