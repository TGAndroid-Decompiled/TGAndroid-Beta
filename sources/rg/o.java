package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45953a;
    public final m0 f45954b;

    public o(m0 m0Var, int i10) {
        this.f45953a = i10;
        this.f45954b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45953a) {
            case 0:
                m0 m0Var = this.f45954b;
                m0Var.getClass();
                m0Var.f45893f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45954b;
                m0Var2.getClass();
                m0Var2.f45893f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
