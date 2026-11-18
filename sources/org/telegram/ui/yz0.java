package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54341a;
    public final r11 f54342b;
    public final boolean f54343c;

    public yz0(r11 r11Var, boolean z10, int i7) {
        this.f54341a = i7;
        this.f54342b = r11Var;
        this.f54343c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54341a) {
            case 0:
                r11 r11Var = this.f54342b;
                p01 p01Var = r11Var.f51438i0;
                f01 f01Var = r11Var.f51440j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54343c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                p01Var.setAlpha(f10);
                p01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                f01Var.setAlpha(floatValue);
                f01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                r11Var.f51442k0.setAlpha(f01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54343c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r11 r11Var2 = this.f54342b;
                r11Var2.f51442k0.setAlpha(r11Var2.f51440j0.getAlpha() * floatValue2);
                return;
        }
    }
}
