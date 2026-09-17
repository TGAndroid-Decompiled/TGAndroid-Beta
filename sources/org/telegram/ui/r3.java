package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37069a;
    public final u3 f37070b;

    public r3(u3 u3Var, int i10) {
        this.f37069a = i10;
        this.f37070b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37069a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.f37070b;
                u3Var.I = floatValue;
                u3Var.f37921c.invalidate();
                u3Var.i();
                u3Var.h();
                return;
            case 1:
                u3 u3Var2 = this.f37070b;
                u3Var2.getClass();
                u3Var2.f37926w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.n();
                u3Var2.i();
                u3Var2.h();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.f37070b;
                u3Var3.f37927x = floatValue2;
                if (!u3Var3.f37923n) {
                    u3Var3.n();
                }
                u3Var3.i();
                u3Var3.h();
                return;
        }
    }
}
