package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f46476a;
    public final m0 f46477b;

    public o(m0 m0Var, int i10) {
        this.f46476a = i10;
        this.f46477b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46476a) {
            case 0:
                m0 m0Var = this.f46477b;
                m0Var.getClass();
                m0Var.f46414f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f46477b;
                m0Var2.getClass();
                m0Var2.f46414f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
