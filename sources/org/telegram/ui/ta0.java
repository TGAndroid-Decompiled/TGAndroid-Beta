package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ta0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50135a;
    public final ee0 f50136b;

    public ta0(ee0 ee0Var, int i7) {
        this.f50135a = i7;
        this.f50136b = ee0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50135a) {
            case 0:
                ee0 ee0Var = this.f50136b;
                ee0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.f45372c.setAlpha(floatValue);
                ee0Var.f45372c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                ee0 ee0Var2 = this.f50136b;
                ee0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                ee0Var2.V.setScaleX(f10);
                ee0Var2.V.setScaleY(f10);
                ee0Var2.V.setAlpha(floatValue2);
                return;
            default:
                ee0 ee0Var3 = this.f50136b;
                ee0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var3.f45372c.setAlpha(floatValue3);
                ee0Var3.f45372c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
