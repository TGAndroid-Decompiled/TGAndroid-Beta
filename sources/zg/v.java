package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49559a;
    public final b0 f49560b;

    public v(b0 b0Var, int i10) {
        this.f49559a = i10;
        this.f49560b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49559a) {
            case 0:
                b0 b0Var = this.f49560b;
                b0Var.getClass();
                b0Var.f49353a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49560b.f49353a.invalidate();
                return;
        }
    }
}
