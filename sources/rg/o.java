package rg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f44398a;
    public final o0 f44399b;

    public o(o0 o0Var, int i10) {
        this.f44398a = i10;
        this.f44399b = o0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44398a) {
            case 0:
                o0 o0Var = this.f44399b;
                o0Var.getClass();
                o0Var.f44410f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o0 o0Var2 = this.f44399b;
                o0Var2.getClass();
                o0Var2.f44410f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
