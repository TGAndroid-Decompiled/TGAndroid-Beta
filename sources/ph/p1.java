package ph;

import android.animation.ValueAnimator;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45954a;
    public final p2 f45955b;

    public p1(p2 p2Var, int i10) {
        this.f45954a = i10;
        this.f45955b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45954a) {
            case 0:
                p2 p2Var = this.f45955b;
                p2Var.getClass();
                p2Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.h();
                return;
            default:
                this.f45955b.f45989y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
