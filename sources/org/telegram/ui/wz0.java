package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51674a;
    public final q11 f51675b;
    public final boolean f51676c;

    public wz0(q11 q11Var, boolean z9, int i7) {
        this.f51674a = i7;
        this.f51675b = q11Var;
        this.f51676c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51674a) {
            case 0:
                q11 q11Var = this.f51675b;
                o01 o01Var = q11Var.f49008h0;
                e01 e01Var = q11Var.f49010i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51676c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.f49012j0.setAlpha(e01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51676c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.f51675b;
                q11Var2.f49012j0.setAlpha(q11Var2.f49010i0.getAlpha() * floatValue2);
                return;
        }
    }
}
