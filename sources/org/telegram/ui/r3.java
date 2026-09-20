package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37035a;
    public final u3 f37036b;

    public r3(u3 u3Var, int i10) {
        this.f37035a = i10;
        this.f37036b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37035a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.f37036b;
                u3Var.I = floatValue;
                u3Var.f37938c.invalidate();
                u3Var.i();
                u3Var.h();
                return;
            case 1:
                u3 u3Var2 = this.f37036b;
                u3Var2.getClass();
                u3Var2.f37943w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.n();
                u3Var2.i();
                u3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.f37036b;
                u3Var3.f37944x = floatValue2;
                if (!u3Var3.f37940n) {
                    u3Var3.n();
                }
                u3Var3.i();
                u3Var3.h();
                return;
        }
    }
}
