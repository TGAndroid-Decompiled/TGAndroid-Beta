package zg;

import android.animation.ValueAnimator;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49499a;
    public final c0 f49500b;

    public w(c0 c0Var, int i10) {
        this.f49499a = i10;
        this.f49500b = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49499a) {
            case 0:
                c0 c0Var = this.f49500b;
                c0Var.getClass();
                c0Var.f49299a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49500b.f49299a.invalidate();
                return;
        }
    }
}
