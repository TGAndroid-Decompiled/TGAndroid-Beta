package zg;

import android.animation.ValueAnimator;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49176a;
    public final c0 f49177b;

    public w(c0 c0Var, int i10) {
        this.f49176a = i10;
        this.f49177b = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49176a) {
            case 0:
                c0 c0Var = this.f49177b;
                c0Var.getClass();
                c0Var.f48976a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f49177b.f48976a.invalidate();
                return;
        }
    }
}
