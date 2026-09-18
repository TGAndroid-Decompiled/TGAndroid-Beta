package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41820a;
    public final m0 f41821b;

    public o(m0 m0Var, int i10) {
        this.f41820a = i10;
        this.f41821b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41820a) {
            case 0:
                m0 m0Var = this.f41821b;
                m0Var.getClass();
                m0Var.f41747f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f41821b;
                m0Var2.getClass();
                m0Var2.f41747f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
