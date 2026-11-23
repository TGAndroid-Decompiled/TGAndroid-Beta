package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54311a;
    public final r11 f54312b;
    public final boolean f54313c;

    public yz0(r11 r11Var, boolean z10, int i7) {
        this.f54311a = i7;
        this.f54312b = r11Var;
        this.f54313c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54311a) {
            case 0:
                r11 r11Var = this.f54312b;
                p01 p01Var = r11Var.f51422i0;
                f01 f01Var = r11Var.f51424j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54313c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                p01Var.setAlpha(f10);
                p01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                f01Var.setAlpha(floatValue);
                f01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                r11Var.f51426k0.setAlpha(f01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54313c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r11 r11Var2 = this.f54312b;
                r11Var2.f51426k0.setAlpha(r11Var2.f51424j0.getAlpha() * floatValue2);
                return;
        }
    }
}
