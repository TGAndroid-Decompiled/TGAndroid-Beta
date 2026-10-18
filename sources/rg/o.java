package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45549a;
    public final m0 f45550b;

    public o(m0 m0Var, int i10) {
        this.f45549a = i10;
        this.f45550b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45549a) {
            case 0:
                m0 m0Var = this.f45550b;
                m0Var.getClass();
                m0Var.f45476f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45550b;
                m0Var2.getClass();
                m0Var2.f45476f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
