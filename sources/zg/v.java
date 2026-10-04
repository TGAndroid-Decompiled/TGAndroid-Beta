package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f53538a;
    public final b0 f53539b;

    public v(b0 b0Var, int i10) {
        this.f53538a = i10;
        this.f53539b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53538a) {
            case 0:
                b0 b0Var = this.f53539b;
                b0Var.getClass();
                b0Var.f53317a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f53539b.f53317a.invalidate();
                return;
        }
    }
}
