package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51691a;
    public final q11 f51692b;
    public final boolean f51693c;

    public wz0(q11 q11Var, boolean z9, int i7) {
        this.f51691a = i7;
        this.f51692b = q11Var;
        this.f51693c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51691a) {
            case 0:
                q11 q11Var = this.f51692b;
                o01 o01Var = q11Var.f49035h0;
                e01 e01Var = q11Var.f49037i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51693c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.f49039j0.setAlpha(e01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51693c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.f51692b;
                q11Var2.f49039j0.setAlpha(q11Var2.f49037i0.getAlpha() * floatValue2);
                return;
        }
    }
}
