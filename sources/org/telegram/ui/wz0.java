package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51689a;
    public final q11 f51690b;
    public final boolean f51691c;

    public wz0(q11 q11Var, boolean z9, int i7) {
        this.f51689a = i7;
        this.f51690b = q11Var;
        this.f51691c = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51689a) {
            case 0:
                q11 q11Var = this.f51690b;
                o01 o01Var = q11Var.f49034h0;
                e01 e01Var = q11Var.f49036i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51691c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.f49038j0.setAlpha(e01Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f51691c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.f51690b;
                q11Var2.f49038j0.setAlpha(q11Var2.f49036i0.getAlpha() * floatValue2);
                return;
        }
    }
}
