package qg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f41525a;
    public final p0 f41526b;

    public o(p0 p0Var, int i10) {
        this.f41525a = i10;
        this.f41526b = p0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41525a) {
            case 0:
                p0 p0Var = this.f41526b;
                p0Var.getClass();
                p0Var.f41552f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                p0 p0Var2 = this.f41526b;
                p0Var2.getClass();
                p0Var2.f41552f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
