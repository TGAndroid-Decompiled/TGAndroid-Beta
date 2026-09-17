package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f45405a;
    public final o0 f45406b;

    public p(o0 o0Var, int i10) {
        this.f45405a = i10;
        this.f45406b = o0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45405a) {
            case 0:
                o0 o0Var = this.f45406b;
                o0Var.getClass();
                o0Var.f45349f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o0 o0Var2 = this.f45406b;
                o0Var2.getClass();
                o0Var2.f45349f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
