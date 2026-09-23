package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41450a;
    public final p0 f41451b;

    public o(p0 p0Var, int i10) {
        this.f41450a = i10;
        this.f41451b = p0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41450a) {
            case 0:
                p0 p0Var = this.f41451b;
                p0Var.getClass();
                p0Var.f41477f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                p0 p0Var2 = this.f41451b;
                p0Var2.getClass();
                p0Var2.f41477f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
