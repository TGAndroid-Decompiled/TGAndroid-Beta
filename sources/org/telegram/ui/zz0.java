package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54668a;
    public final s11 f54669b;
    public final boolean f54670c;

    public zz0(s11 s11Var, boolean z10, int i7) {
        this.f54668a = i7;
        this.f54669b = s11Var;
        this.f54670c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54668a) {
            case 0:
                s11 s11Var = this.f54669b;
                q01 q01Var = s11Var.f51840i0;
                g01 g01Var = s11Var.f51842j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54670c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                q01Var.setAlpha(f10);
                q01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                g01Var.setAlpha(floatValue);
                g01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                s11Var.f51844k0.setAlpha(g01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54670c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                s11 s11Var2 = this.f54669b;
                s11Var2.f51844k0.setAlpha(s11Var2.f51842j0.getAlpha() * floatValue2);
                return;
        }
    }
}
