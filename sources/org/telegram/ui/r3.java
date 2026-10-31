package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41122a;
    public final u3 f41123b;

    public r3(u3 u3Var, int i10) {
        this.f41122a = i10;
        this.f41123b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41122a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.f41123b;
                u3Var.I = floatValue;
                u3Var.f41997c.invalidate();
                u3Var.u();
                u3Var.r();
                return;
            case 1:
                u3 u3Var2 = this.f41123b;
                u3Var2.getClass();
                u3Var2.f42003x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.A();
                u3Var2.u();
                u3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.f41123b;
                u3Var3.f42004y = floatValue2;
                if (!u3Var3.f41999n) {
                    u3Var3.A();
                }
                u3Var3.u();
                u3Var3.r();
                return;
        }
    }
}
