package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45244a;
    public final m0 f45245b;

    public o(m0 m0Var, int i10) {
        this.f45244a = i10;
        this.f45245b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45244a) {
            case 0:
                m0 m0Var = this.f45245b;
                m0Var.getClass();
                m0Var.f45173f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45245b;
                m0Var2.getClass();
                m0Var2.f45173f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
