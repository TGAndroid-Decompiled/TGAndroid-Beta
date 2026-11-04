package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56187a;
    public final f0 f56188b;

    public o(f0 f0Var, int i3) {
        this.f56187a = i3;
        this.f56188b = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56187a) {
            case 0:
                f0 f0Var = this.f56188b;
                f0Var.getClass();
                f0Var.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                f0 f0Var2 = this.f56188b;
                f0Var2.getClass();
                f0Var2.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
