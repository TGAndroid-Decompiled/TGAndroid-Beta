package zg;

import android.animation.ValueAnimator;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49127a;
    public final c0 f49128b;

    public w(c0 c0Var, int i10) {
        this.f49127a = i10;
        this.f49128b = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49127a) {
            case 0:
                c0 c0Var = this.f49128b;
                c0Var.getClass();
                c0Var.f48927a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49128b.f48927a.invalidate();
                return;
        }
    }
}
