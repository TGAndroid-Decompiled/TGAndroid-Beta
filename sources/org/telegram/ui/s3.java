package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43348a;
    public final v3 f43349b;

    public s3(v3 v3Var, int i10) {
        this.f43348a = i10;
        this.f43349b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43348a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.f43349b;
                v3Var.I = floatValue;
                v3Var.f44586c.invalidate();
                v3Var.i();
                v3Var.h();
                return;
            case 1:
                v3 v3Var2 = this.f43349b;
                v3Var2.getClass();
                v3Var2.f44591w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.f43349b;
                v3Var3.f44592x = floatValue2;
                if (!v3Var3.f44588n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                return;
        }
    }
}
