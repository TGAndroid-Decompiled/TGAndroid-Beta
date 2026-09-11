package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f45404a;
    public final o0 f45405b;

    public p(o0 o0Var, int i10) {
        this.f45404a = i10;
        this.f45405b = o0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45404a) {
            case 0:
                o0 o0Var = this.f45405b;
                o0Var.getClass();
                o0Var.f45348f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o0 o0Var2 = this.f45405b;
                o0Var2.getClass();
                o0Var2.f45348f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
