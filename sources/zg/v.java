package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54907a;
    public final a0 f54908b;

    public v(a0 a0Var, int i10) {
        this.f54907a = i10;
        this.f54908b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54907a) {
            case 0:
                a0 a0Var = this.f54908b;
                a0Var.getClass();
                a0Var.f54681a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54908b.f54681a.invalidate();
                return;
        }
    }
}
