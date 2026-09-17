package zg;

import android.animation.ValueAnimator;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49206a;
    public final c0 f49207b;

    public w(c0 c0Var, int i10) {
        this.f49206a = i10;
        this.f49207b = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49206a) {
            case 0:
                c0 c0Var = this.f49207b;
                c0Var.getClass();
                c0Var.f49006a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49207b.f49006a.invalidate();
                return;
        }
    }
}
