package xh;

import android.animation.ValueAnimator;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53963a;
    public final m2 f53964b;

    public p1(m2 m2Var, int i10) {
        this.f53963a = i10;
        this.f53964b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53963a) {
            case 0:
                m2 m2Var = this.f53964b;
                m2Var.getClass();
                m2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.l();
                return;
            default:
                this.f53964b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
