package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52919a;
    public final yy0 f52920b;

    public vy0(yy0 yy0Var, int i7) {
        this.f52919a = i7;
        this.f52920b = yy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52919a) {
            case 0:
                yy0 yy0Var = this.f52920b;
                yy0Var.getClass();
                yy0Var.f54337e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.g();
                return;
            case 1:
                yy0 yy0Var2 = this.f52920b;
                yy0Var2.getClass();
                yy0Var2.f54337e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var2.g();
                return;
            default:
                yy0 yy0Var3 = this.f52920b;
                yy0Var3.getClass();
                yy0Var3.f54337e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var3.g();
                return;
        }
    }
}
