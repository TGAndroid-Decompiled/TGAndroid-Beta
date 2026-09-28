package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f49452a;
    public final b0 f49453b;

    public v(b0 b0Var, int i10) {
        this.f49452a = i10;
        this.f49453b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49452a) {
            case 0:
                b0 b0Var = this.f49453b;
                b0Var.getClass();
                b0Var.f49246a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49453b.f49246a.invalidate();
                return;
        }
    }
}
