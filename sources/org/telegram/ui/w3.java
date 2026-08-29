package org.telegram.ui;

import android.animation.ValueAnimator;
public final class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43830a;
    public final z3 f43831b;

    public w3(z3 z3Var, int i10) {
        this.f43830a = i10;
        this.f43831b = z3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43830a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var = this.f43831b;
                z3Var.E = floatValue;
                z3Var.f45046c.invalidate();
                z3Var.i();
                z3Var.h();
                return;
            case 1:
                z3 z3Var2 = this.f43831b;
                z3Var2.getClass();
                z3Var2.f45052w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.n();
                z3Var2.i();
                z3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var3 = this.f43831b;
                z3Var3.f45053x = floatValue2;
                if (!z3Var3.f45049n) {
                    z3Var3.n();
                }
                z3Var3.i();
                z3Var3.h();
                return;
        }
    }
}
