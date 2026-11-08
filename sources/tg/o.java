package tg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f55870a;
    public final g0 f55871b;

    public o(g0 g0Var, int i7) {
        this.f55870a = i7;
        this.f55871b = g0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f55870a) {
            case 0:
                g0 g0Var = this.f55871b;
                g0Var.getClass();
                g0Var.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g0 g0Var2 = this.f55871b;
                g0Var2.getClass();
                g0Var2.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
