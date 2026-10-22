package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45554a;
    public final m0 f45555b;

    public o(m0 m0Var, int i10) {
        this.f45554a = i10;
        this.f45555b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45554a) {
            case 0:
                m0 m0Var = this.f45555b;
                m0Var.getClass();
                m0Var.f45486f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45555b;
                m0Var2.getClass();
                m0Var2.f45486f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
