package tg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58058a;
    public final g0 f58059b;

    public o(g0 g0Var, int i7) {
        this.f58058a = i7;
        this.f58059b = g0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58058a) {
            case 0:
                g0 g0Var = this.f58059b;
                g0Var.getClass();
                g0Var.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g0 g0Var2 = this.f58059b;
                g0Var2.getClass();
                g0Var2.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
