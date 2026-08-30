package rh;

import android.animation.ValueAnimator;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43676a;
    public final q2 f43677b;

    public q1(q2 q2Var, int i10) {
        this.f43676a = i10;
        this.f43677b = q2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43676a) {
            case 0:
                q2 q2Var = this.f43677b;
                q2Var.getClass();
                q2Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.h();
                return;
            default:
                this.f43677b.f43710y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
