package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49440a;
    public final b0 f49441b;

    public v(b0 b0Var, int i10) {
        this.f49440a = i10;
        this.f49441b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49440a) {
            case 0:
                b0 b0Var = this.f49441b;
                b0Var.getClass();
                b0Var.f49234a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49441b.f49234a.invalidate();
                return;
        }
    }
}
