package sg;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f48488a;
    public final b0 f48489b;

    public u(b0 b0Var, int i10) {
        this.f48488a = i10;
        this.f48489b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48488a) {
            case 0:
                b0 b0Var = this.f48489b;
                b0Var.getClass();
                b0Var.f48286a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f48489b.f48286a.invalidate();
                return;
        }
    }
}
