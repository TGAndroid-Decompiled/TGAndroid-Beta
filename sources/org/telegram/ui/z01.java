package org.telegram.ui;

import android.animation.ValueAnimator;
public final class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52381a;
    public final c11 f52382b;

    public z01(c11 c11Var, int i7) {
        this.f52381a = i7;
        this.f52382b = c11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52381a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var = this.f52382b;
                c11Var.N = floatValue;
                c11Var.V.f49680h0.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var2 = this.f52382b;
                c11Var2.N = floatValue2;
                c11Var2.V.f49680h0.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var3 = this.f52382b;
                c11Var3.N = floatValue3;
                c11Var3.V.f49680h0.invalidate();
                return;
        }
    }
}
