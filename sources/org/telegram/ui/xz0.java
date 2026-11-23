package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54131a;
    public final q11 f54132b;
    public final boolean f54133c;

    public xz0(q11 q11Var, boolean z10, int i7) {
        this.f54131a = i7;
        this.f54132b = q11Var;
        this.f54133c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54131a) {
            case 0:
                q11 q11Var = this.f54132b;
                o01 o01Var = q11Var.f51247i0;
                e01 e01Var = q11Var.f51249j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54133c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.f51251k0.setAlpha(e01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54133c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.f54132b;
                q11Var2.f51251k0.setAlpha(q11Var2.f51249j0.getAlpha() * floatValue2);
                return;
        }
    }
}
