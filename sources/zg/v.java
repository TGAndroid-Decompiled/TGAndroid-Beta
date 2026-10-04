package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f53537a;
    public final b0 f53538b;

    public v(b0 b0Var, int i10) {
        this.f53537a = i10;
        this.f53538b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53537a) {
            case 0:
                b0 b0Var = this.f53538b;
                b0Var.getClass();
                b0Var.f53316a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f53538b.f53316a.invalidate();
                return;
        }
    }
}
