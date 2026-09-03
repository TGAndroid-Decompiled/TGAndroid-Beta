package rh;

import android.animation.ValueAnimator;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43728a;
    public final p2 f43729b;

    public p1(p2 p2Var, int i10) {
        this.f43728a = i10;
        this.f43729b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43728a) {
            case 0:
                p2 p2Var = this.f43729b;
                p2Var.getClass();
                p2Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.h();
                return;
            default:
                this.f43729b.f43762y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
