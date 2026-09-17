package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40294a;
    public final v3 f40295b;

    public s3(v3 v3Var, int i10) {
        this.f40294a = i10;
        this.f40295b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40294a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.f40295b;
                v3Var.I = floatValue;
                v3Var.f41396c.invalidate();
                v3Var.i();
                v3Var.h();
                return;
            case 1:
                v3 v3Var2 = this.f40295b;
                v3Var2.getClass();
                v3Var2.f41402w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.f40295b;
                v3Var3.f41403x = floatValue2;
                if (!v3Var3.f41399n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                return;
        }
    }
}
