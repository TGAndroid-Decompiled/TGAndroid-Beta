package org.telegram.ui;

import android.animation.ValueAnimator;

public final class w3 implements ValueAnimator.AnimatorUpdateListener {

    public final int f43589a;

    public final z3 f43590b;

    public w3(z3 z3Var, int i10) {
        this.f43589a = i10;
        this.f43590b = z3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43589a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var = this.f43590b;
                z3Var.E = fFloatValue;
                z3Var.f45005c.invalidate();
                z3Var.i();
                z3Var.h();
                break;
            case 1:
                z3 z3Var2 = this.f43590b;
                z3Var2.getClass();
                z3Var2.f45011w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.n();
                z3Var2.i();
                z3Var2.h();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var3 = this.f43590b;
                z3Var3.f45012x = fFloatValue2;
                if (!z3Var3.f45008n) {
                    z3Var3.n();
                }
                z3Var3.i();
                z3Var3.h();
                break;
        }
    }
}
