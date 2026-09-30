package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49453a;
    public final b0 f49454b;

    public v(b0 b0Var, int i10) {
        this.f49453a = i10;
        this.f49454b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49453a) {
            case 0:
                b0 b0Var = this.f49454b;
                b0Var.getClass();
                b0Var.f49247a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49454b.f49247a.invalidate();
                return;
        }
    }
}
