package zg;

import android.animation.ValueAnimator;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f54796a;
    public final a0 f54797b;

    public v(a0 a0Var, int i10) {
        this.f54796a = i10;
        this.f54797b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54796a) {
            case 0:
                a0 a0Var = this.f54797b;
                a0Var.getClass();
                a0Var.f54570a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f54797b.f54570a.invalidate();
                return;
        }
    }
}
