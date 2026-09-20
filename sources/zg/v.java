package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49478a;
    public final b0 f49479b;

    public v(b0 b0Var, int i10) {
        this.f49478a = i10;
        this.f49479b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49478a) {
            case 0:
                b0 b0Var = this.f49479b;
                b0Var.getClass();
                b0Var.f49272a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49479b.f49272a.invalidate();
                return;
        }
    }
}
