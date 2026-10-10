package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54719a;
    public final a0 f54720b;

    public v(a0 a0Var, int i10) {
        this.f54719a = i10;
        this.f54720b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54719a) {
            case 0:
                a0 a0Var = this.f54720b;
                a0Var.getClass();
                a0Var.f54493a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54720b.f54493a.invalidate();
                return;
        }
    }
}
