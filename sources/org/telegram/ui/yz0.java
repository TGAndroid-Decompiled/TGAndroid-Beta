package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54300a;
    public final r11 f54301b;
    public final boolean f54302c;

    public yz0(r11 r11Var, boolean z10, int i7) {
        this.f54300a = i7;
        this.f54301b = r11Var;
        this.f54302c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54300a) {
            case 0:
                r11 r11Var = this.f54301b;
                p01 p01Var = r11Var.f51398i0;
                f01 f01Var = r11Var.f51400j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54302c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                p01Var.setAlpha(f10);
                p01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                f01Var.setAlpha(floatValue);
                f01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                r11Var.f51402k0.setAlpha(f01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54302c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r11 r11Var2 = this.f54301b;
                r11Var2.f51402k0.setAlpha(r11Var2.f51400j0.getAlpha() * floatValue2);
                return;
        }
    }
}
