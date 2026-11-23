package tg;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f58255a;
    public final l0 f58256b;

    public u(l0 l0Var, int i7) {
        this.f58255a = i7;
        this.f58256b = l0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58255a) {
            case 0:
                l0 l0Var = this.f58256b;
                l0Var.getClass();
                l0Var.T1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                l0 l0Var2 = this.f58256b;
                l0Var2.getClass();
                l0Var2.T1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
