package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f45251a;
    public final m0 f45252b;

    public o(m0 m0Var, int i10) {
        this.f45251a = i10;
        this.f45252b = m0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45251a) {
            case 0:
                m0 m0Var = this.f45252b;
                m0Var.getClass();
                m0Var.f45180f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m0 m0Var2 = this.f45252b;
                m0Var2.getClass();
                m0Var2.f45180f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
