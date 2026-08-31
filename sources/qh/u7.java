package qh;

import android.animation.ValueAnimator;
public final class u7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46164a;
    public final v7 f46165b;

    public u7(v7 v7Var, int i10) {
        this.f46164a = i10;
        this.f46165b = v7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46164a) {
            case 0:
                v7.a(this.f46165b, valueAnimator);
                return;
            default:
                v7 v7Var = this.f46165b;
                v7Var.getClass();
                v7Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
