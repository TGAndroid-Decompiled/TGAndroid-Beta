package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37037a;
    public final x9 f37038b;

    public r9(x9 x9Var, int i10) {
        this.f37037a = i10;
        this.f37038b = x9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37037a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = this.f37038b;
                x9Var.X = floatValue;
                x9Var.f39568a.setAlpha(1.0f - floatValue);
                if (x9Var.V == 3) {
                    x9Var.f39570b.setAlpha(1.0f - x9Var.X);
                }
                x9Var.f39578r.setAlpha(1.0f - x9Var.X);
                x9Var.v = (x9Var.X * 0.25f) + 0.5f;
                x9Var.fragmentView.invalidate();
                return;
            default:
                this.f37038b.f39578r.invalidate();
                return;
        }
    }
}
