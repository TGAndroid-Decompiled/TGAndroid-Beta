package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45952a;
    public final m0 f45953b;

    public o(m0 m0Var, int i10) {
        this.f45952a = i10;
        this.f45953b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45952a) {
            case 0:
                m0 m0Var = this.f45953b;
                m0Var.getClass();
                m0Var.f45892f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45953b;
                m0Var2.getClass();
                m0Var2.f45892f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
