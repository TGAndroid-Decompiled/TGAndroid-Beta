package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41849a;
    public final n0 f41850b;

    public o(n0 n0Var, int i10) {
        this.f41849a = i10;
        this.f41850b = n0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41849a) {
            case 0:
                n0 n0Var = this.f41850b;
                n0Var.getClass();
                n0Var.f41794f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n0 n0Var2 = this.f41850b;
                n0Var2.getClass();
                n0Var2.f41794f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
