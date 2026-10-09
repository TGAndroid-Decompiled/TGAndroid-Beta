package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54675a;
    public final a0 f54676b;

    public v(a0 a0Var, int i10) {
        this.f54675a = i10;
        this.f54676b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54675a) {
            case 0:
                a0 a0Var = this.f54676b;
                a0Var.getClass();
                a0Var.f54449a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54676b.f54449a.invalidate();
                return;
        }
    }
}
