package tg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58096a;
    public final h0 f58097b;

    public o(h0 h0Var, int i7) {
        this.f58096a = i7;
        this.f58097b = h0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58096a) {
            case 0:
                h0 h0Var = this.f58097b;
                h0Var.getClass();
                h0Var.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                h0 h0Var2 = this.f58097b;
                h0Var2.getClass();
                h0Var2.P1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
