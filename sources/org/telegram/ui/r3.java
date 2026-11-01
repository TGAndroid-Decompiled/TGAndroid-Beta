package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40966a;
    public final u3 f40967b;

    public r3(u3 u3Var, int i10) {
        this.f40966a = i10;
        this.f40967b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40966a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.f40967b;
                u3Var.I = floatValue;
                u3Var.f41775c.invalidate();
                u3Var.u();
                u3Var.r();
                return;
            case 1:
                u3 u3Var2 = this.f40967b;
                u3Var2.getClass();
                u3Var2.f41781x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.A();
                u3Var2.u();
                u3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.f40967b;
                u3Var3.f41782y = floatValue2;
                if (!u3Var3.f41777n) {
                    u3Var3.A();
                }
                u3Var3.u();
                u3Var3.r();
                return;
        }
    }
}
