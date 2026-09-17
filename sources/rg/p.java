package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f45433a;
    public final o0 f45434b;

    public p(o0 o0Var, int i10) {
        this.f45433a = i10;
        this.f45434b = o0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45433a) {
            case 0:
                o0 o0Var = this.f45434b;
                o0Var.getClass();
                o0Var.f45377f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o0 o0Var2 = this.f45434b;
                o0Var2.getClass();
                o0Var2.f45377f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
