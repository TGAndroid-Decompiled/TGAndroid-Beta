package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sa0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51957a;
    public final de0 f51958b;

    public sa0(de0 de0Var, int i7) {
        this.f51957a = i7;
        this.f51958b = de0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51957a) {
            case 0:
                de0 de0Var = this.f51958b;
                de0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.f46890c.setAlpha(floatValue);
                de0Var.f46890c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                de0 de0Var2 = this.f51958b;
                de0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                de0Var2.W.setScaleX(f10);
                de0Var2.W.setScaleY(f10);
                de0Var2.W.setAlpha(floatValue2);
                return;
            default:
                de0 de0Var3 = this.f51958b;
                de0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var3.f46890c.setAlpha(floatValue3);
                de0Var3.f46890c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
