package sh;

import android.animation.ValueAnimator;
public final class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47579a;
    public final p2 f47580b;

    public p1(p2 p2Var, int i10) {
        this.f47579a = i10;
        this.f47580b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47579a) {
            case 0:
                p2 p2Var = this.f47580b;
                p2Var.getClass();
                p2Var.K0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.h();
                return;
            default:
                this.f47580b.f47614y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
