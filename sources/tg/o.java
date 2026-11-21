package tg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58092a;
    public final h0 f58093b;

    public o(h0 h0Var, int i7) {
        this.f58092a = i7;
        this.f58093b = h0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58092a) {
            case 0:
                h0 h0Var = this.f58093b;
                h0Var.getClass();
                h0Var.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                h0 h0Var2 = this.f58093b;
                h0Var2.getClass();
                h0Var2.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
