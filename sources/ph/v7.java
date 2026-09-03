package ph;

import android.animation.ValueAnimator;
public final class v7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42517a;
    public final w7 f42518b;

    public v7(w7 w7Var, int i10) {
        this.f42517a = i10;
        this.f42518b = w7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42517a) {
            case 0:
                w7.a(this.f42518b, valueAnimator);
                return;
            default:
                w7 w7Var = this.f42518b;
                w7Var.getClass();
                w7Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
