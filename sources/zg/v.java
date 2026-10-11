package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54762a;
    public final a0 f54763b;

    public v(a0 a0Var, int i10) {
        this.f54762a = i10;
        this.f54763b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54762a) {
            case 0:
                a0 a0Var = this.f54763b;
                a0Var.getClass();
                a0Var.f54536a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54763b.f54536a.invalidate();
                return;
        }
    }
}
