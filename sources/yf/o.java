package yf;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f50041a;
    public final l0 f50042b;

    public o(l0 l0Var, int i9) {
        this.f50041a = i9;
        this.f50042b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50041a) {
            case 0:
                l0 l0Var = this.f50042b;
                l0Var.getClass();
                l0Var.f49929b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                l0 l0Var2 = this.f50042b;
                l0Var2.getClass();
                l0Var2.f49929b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
