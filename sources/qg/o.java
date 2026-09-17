package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41520a;
    public final p0 f41521b;

    public o(p0 p0Var, int i10) {
        this.f41520a = i10;
        this.f41521b = p0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41520a) {
            case 0:
                p0 p0Var = this.f41521b;
                p0Var.getClass();
                p0Var.f41547f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                p0 p0Var2 = this.f41521b;
                p0Var2.getClass();
                p0Var2.f41547f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
