package sg;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f48477a;
    public final b0 f48478b;

    public u(b0 b0Var, int i10) {
        this.f48477a = i10;
        this.f48478b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48477a) {
            case 0:
                b0 b0Var = this.f48478b;
                b0Var.getClass();
                b0Var.f48275a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f48478b.f48275a.invalidate();
                return;
        }
    }
}
