package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ry0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51053a;
    public final uy0 f51054b;

    public ry0(uy0 uy0Var, int i7) {
        this.f51053a = i7;
        this.f51054b = uy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51053a) {
            case 0:
                uy0 uy0Var = this.f51054b;
                uy0Var.getClass();
                uy0Var.f52060e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var.g();
                return;
            case 1:
                uy0 uy0Var2 = this.f51054b;
                uy0Var2.getClass();
                uy0Var2.f52060e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var2.g();
                return;
            default:
                uy0 uy0Var3 = this.f51054b;
                uy0Var3.getClass();
                uy0Var3.f52060e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var3.g();
                return;
        }
    }
}
