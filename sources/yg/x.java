package yg;

import android.animation.ValueAnimator;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f47159a;
    public final c0 f47160b;

    public x(c0 c0Var, int i10) {
        this.f47159a = i10;
        this.f47160b = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47159a) {
            case 0:
                c0 c0Var = this.f47160b;
                c0Var.getClass();
                c0Var.f46950a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f47160b.f46950a.invalidate();
                return;
        }
    }
}
