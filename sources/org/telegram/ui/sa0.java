package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sa0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51944a;
    public final ee0 f51945b;

    public sa0(ee0 ee0Var, int i7) {
        this.f51944a = i7;
        this.f51945b = ee0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51944a) {
            case 0:
                ee0 ee0Var = this.f51945b;
                ee0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.f47181c.setAlpha(floatValue);
                ee0Var.f47181c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                ee0 ee0Var2 = this.f51945b;
                ee0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                ee0Var2.W.setScaleX(f10);
                ee0Var2.W.setScaleY(f10);
                ee0Var2.W.setAlpha(floatValue2);
                return;
            default:
                ee0 ee0Var3 = this.f51945b;
                ee0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var3.f47181c.setAlpha(floatValue3);
                ee0Var3.f47181c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
