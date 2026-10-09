package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54673a;
    public final a0 f54674b;

    public v(a0 a0Var, int i10) {
        this.f54673a = i10;
        this.f54674b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54673a) {
            case 0:
                a0 a0Var = this.f54674b;
                a0Var.getClass();
                a0Var.f54447a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54674b.f54447a.invalidate();
                return;
        }
    }
}
