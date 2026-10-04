package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f53543a;
    public final b0 f53544b;

    public v(b0 b0Var, int i10) {
        this.f53543a = i10;
        this.f53544b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53543a) {
            case 0:
                b0 b0Var = this.f53544b;
                b0Var.getClass();
                b0Var.f53322a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f53544b.f53322a.invalidate();
                return;
        }
    }
}
