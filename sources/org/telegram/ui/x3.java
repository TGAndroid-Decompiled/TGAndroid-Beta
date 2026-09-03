package org.telegram.ui;

import android.animation.ValueAnimator;
public final class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39835a;
    public final a4 f39836b;

    public x3(a4 a4Var, int i10) {
        this.f39835a = i10;
        this.f39836b = a4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39835a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4 a4Var = this.f39836b;
                a4Var.F = floatValue;
                a4Var.f32442c.invalidate();
                a4Var.i();
                a4Var.h();
                return;
            case 1:
                a4 a4Var2 = this.f39836b;
                a4Var2.getClass();
                a4Var2.f32447w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4Var2.n();
                a4Var2.i();
                a4Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4 a4Var3 = this.f39836b;
                a4Var3.f32448x = floatValue2;
                if (!a4Var3.f32444n) {
                    a4Var3.n();
                }
                a4Var3.i();
                a4Var3.h();
                return;
        }
    }
}
