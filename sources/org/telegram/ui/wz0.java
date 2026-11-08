package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51696a;
    public final q11 f51697b;
    public final boolean f51698c;

    public wz0(q11 q11Var, boolean z9, int i7) {
        this.f51696a = i7;
        this.f51697b = q11Var;
        this.f51698c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51696a) {
            case 0:
                q11 q11Var = this.f51697b;
                o01 o01Var = q11Var.f49037h0;
                e01 e01Var = q11Var.f49039i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51698c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.f49041j0.setAlpha(e01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51698c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.f51697b;
                q11Var2.f49041j0.setAlpha(q11Var2.f49039i0.getAlpha() * floatValue2);
                return;
        }
    }
}
