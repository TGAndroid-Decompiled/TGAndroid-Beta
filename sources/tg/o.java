package tg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f57483a;
    public final g0 f57484b;

    public o(g0 g0Var, int i7) {
        this.f57483a = i7;
        this.f57484b = g0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f57483a) {
            case 0:
                g0 g0Var = this.f57484b;
                g0Var.getClass();
                g0Var.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g0 g0Var2 = this.f57484b;
                g0Var2.getClass();
                g0Var2.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
