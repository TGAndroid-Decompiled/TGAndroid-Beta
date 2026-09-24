package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41821a;
    public final n0 f41822b;

    public o(n0 n0Var, int i10) {
        this.f41821a = i10;
        this.f41822b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41821a) {
            case 0:
                n0 n0Var = this.f41822b;
                n0Var.getClass();
                n0Var.f41766f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n0 n0Var2 = this.f41822b;
                n0Var2.getClass();
                n0Var2.f41766f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
