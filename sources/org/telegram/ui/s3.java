package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37579a;
    public final v3 f37580b;

    public s3(v3 v3Var, int i10) {
        this.f37579a = i10;
        this.f37580b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37579a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.f37580b;
                v3Var.I = floatValue;
                v3Var.f38620c.invalidate();
                v3Var.i();
                v3Var.h();
                return;
            case 1:
                v3 v3Var2 = this.f37580b;
                v3Var2.getClass();
                v3Var2.f38625w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.f37580b;
                v3Var3.f38626x = floatValue2;
                if (!v3Var3.f38622n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                return;
        }
    }
}
