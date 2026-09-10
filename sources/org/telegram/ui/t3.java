package org.telegram.ui;

import android.animation.ValueAnimator;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36827a;
    public final w3 f36828b;

    public t3(w3 w3Var, int i10) {
        this.f36827a = i10;
        this.f36828b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36827a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = this.f36828b;
                w3Var.I = floatValue;
                w3Var.f37687c.invalidate();
                w3Var.i();
                w3Var.h();
                return;
            case 1:
                w3 w3Var2 = this.f36828b;
                w3Var2.getClass();
                w3Var2.f37692w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.n();
                w3Var2.i();
                w3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var3 = this.f36828b;
                w3Var3.f37693x = floatValue2;
                if (!w3Var3.f37689n) {
                    w3Var3.n();
                }
                w3Var3.i();
                w3Var3.h();
                return;
        }
    }
}
