package zf;

import android.animation.ValueAnimator;

public final class o implements ValueAnimator.AnimatorUpdateListener {

    public final int f50631a;

    public final l0 f50632b;

    public o(l0 l0Var, int i10) {
        this.f50631a = i10;
        this.f50632b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50631a) {
            case 0:
                l0 l0Var = this.f50632b;
                l0Var.getClass();
                l0Var.f50507b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l0 l0Var2 = this.f50632b;
                l0Var2.getClass();
                l0Var2.f50507b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
