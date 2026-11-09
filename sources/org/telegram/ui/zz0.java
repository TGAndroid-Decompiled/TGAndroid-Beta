package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52716a;
    public final s11 f52717b;
    public final boolean f52718c;

    public zz0(s11 s11Var, boolean z9, int i7) {
        this.f52716a = i7;
        this.f52717b = s11Var;
        this.f52718c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52716a) {
            case 0:
                s11 s11Var = this.f52717b;
                q01 q01Var = s11Var.f49680h0;
                g01 g01Var = s11Var.f49682i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f52718c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                q01Var.setAlpha(f10);
                q01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                g01Var.setAlpha(floatValue);
                g01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                s11Var.f49684j0.setAlpha(g01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f52718c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                s11 s11Var2 = this.f52717b;
                s11Var2.f49684j0.setAlpha(s11Var2.f49682i0.getAlpha() * floatValue2);
                return;
        }
    }
}
