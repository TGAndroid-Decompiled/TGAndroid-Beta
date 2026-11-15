package org.telegram.ui;

import android.animation.ValueAnimator;
public final class uz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52071a;
    public final n11 f52072b;
    public final boolean f52073c;

    public uz0(n11 n11Var, boolean z10, int i7) {
        this.f52071a = i7;
        this.f52072b = n11Var;
        this.f52073c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52071a) {
            case 0:
                n11 n11Var = this.f52072b;
                l01 l01Var = n11Var.f49386i0;
                b01 b01Var = n11Var.f49388j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f52073c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                l01Var.setAlpha(f10);
                l01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                b01Var.setAlpha(floatValue);
                b01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                n11Var.f49390k0.setAlpha(b01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f52073c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                n11 n11Var2 = this.f52072b;
                n11Var2.f49390k0.setAlpha(n11Var2.f49388j0.getAlpha() * floatValue2);
                return;
        }
    }
}
