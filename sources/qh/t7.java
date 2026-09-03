package qh;

import android.animation.ValueAnimator;
public final class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46144a;
    public final u7 f46145b;

    public t7(u7 u7Var, int i10) {
        this.f46144a = i10;
        this.f46145b = u7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46144a) {
            case 0:
                u7.a(this.f46145b, valueAnimator);
                return;
            default:
                u7 u7Var = this.f46145b;
                u7Var.getClass();
                u7Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
