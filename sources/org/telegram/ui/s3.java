package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41793a;
    public final v3 f41794b;

    public s3(v3 v3Var, int i10) {
        this.f41793a = i10;
        this.f41794b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41793a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.f41794b;
                v3Var.I = floatValue;
                v3Var.f42655c.invalidate();
                v3Var.i();
                v3Var.h();
                return;
            case 1:
                v3 v3Var2 = this.f41794b;
                v3Var2.getClass();
                v3Var2.f42661w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.f41794b;
                v3Var3.f42662x = floatValue2;
                if (!v3Var3.f42658n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                return;
        }
    }
}
