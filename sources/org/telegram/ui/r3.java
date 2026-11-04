package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49011a;
    public final u3 f49012b;

    public r3(u3 u3Var, int i3) {
        this.f49011a = i3;
        this.f49012b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49011a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.f49012b;
                u3Var.J = floatValue;
                u3Var.f49951c.invalidate();
                u3Var.u();
                u3Var.r();
                return;
            case 1:
                u3 u3Var2 = this.f49012b;
                u3Var2.getClass();
                u3Var2.f49958x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.A();
                u3Var2.u();
                u3Var2.r();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.f49012b;
                u3Var3.f49959y = floatValue2;
                if (!u3Var3.f49954n) {
                    u3Var3.A();
                }
                u3Var3.u();
                u3Var3.r();
                return;
        }
    }
}
