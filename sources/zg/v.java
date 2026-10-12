package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54899a;
    public final a0 f54900b;

    public v(a0 a0Var, int i10) {
        this.f54899a = i10;
        this.f54900b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54899a) {
            case 0:
                a0 a0Var = this.f54900b;
                a0Var.getClass();
                a0Var.f54673a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54900b.f54673a.invalidate();
                return;
        }
    }
}
