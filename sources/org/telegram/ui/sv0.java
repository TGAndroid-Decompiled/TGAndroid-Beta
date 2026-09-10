package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36766a;
    public final bw0 f36767b;

    public sv0(bw0 bw0Var, int i10) {
        this.f36766a = i10;
        this.f36767b = bw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36766a) {
            case 0:
                bw0 bw0Var = this.f36767b;
                bw0Var.getClass();
                bw0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                bw0 bw0Var2 = this.f36767b;
                bw0Var2.getClass();
                bw0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
