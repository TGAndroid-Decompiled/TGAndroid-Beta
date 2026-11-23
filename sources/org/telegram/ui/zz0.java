package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54672a;
    public final s11 f54673b;
    public final boolean f54674c;

    public zz0(s11 s11Var, boolean z10, int i7) {
        this.f54672a = i7;
        this.f54673b = s11Var;
        this.f54674c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54672a) {
            case 0:
                s11 s11Var = this.f54673b;
                q01 q01Var = s11Var.f51844i0;
                g01 g01Var = s11Var.f51846j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54674c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                q01Var.setAlpha(f10);
                q01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                g01Var.setAlpha(floatValue);
                g01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                s11Var.f51848k0.setAlpha(g01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f54674c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                s11 s11Var2 = this.f54673b;
                s11Var2.f51848k0.setAlpha(s11Var2.f51846j0.getAlpha() * floatValue2);
                return;
        }
    }
}
