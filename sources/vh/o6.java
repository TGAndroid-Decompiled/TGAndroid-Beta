package vh;

import android.animation.ValueAnimator;
public final class o6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51616a;
    public final p6 f51617b;

    public o6(p6 p6Var, int i10) {
        this.f51616a = i10;
        this.f51617b = p6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51616a) {
            case 0:
                p6.a(this.f51617b, valueAnimator);
                return;
            default:
                p6 p6Var = this.f51617b;
                p6Var.getClass();
                p6Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
