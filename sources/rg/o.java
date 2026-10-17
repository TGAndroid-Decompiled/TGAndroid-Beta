package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45569a;
    public final m0 f45570b;

    public o(m0 m0Var, int i10) {
        this.f45569a = i10;
        this.f45570b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45569a) {
            case 0:
                m0 m0Var = this.f45570b;
                m0Var.getClass();
                m0Var.f45502f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45570b;
                m0Var2.getClass();
                m0Var2.f45502f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
