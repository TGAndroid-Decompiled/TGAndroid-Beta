package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49451a;
    public final b0 f49452b;

    public v(b0 b0Var, int i10) {
        this.f49451a = i10;
        this.f49452b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49451a) {
            case 0:
                b0 b0Var = this.f49452b;
                b0Var.getClass();
                b0Var.f49245a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49452b.f49245a.invalidate();
                return;
        }
    }
}
