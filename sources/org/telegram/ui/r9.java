package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39378a;
    public final z9 f39379b;

    public r9(z9 z9Var, int i10) {
        this.f39378a = i10;
        this.f39379b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39378a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = this.f39379b;
                z9Var.Z = floatValue;
                z9Var.f42221a.setAlpha(1.0f - floatValue);
                if (z9Var.X == 3) {
                    z9Var.f42223b.setAlpha(1.0f - z9Var.Z);
                }
                z9Var.f42234s.setAlpha(1.0f - z9Var.Z);
                z9Var.f42235w = (z9Var.Z * 0.25f) + 0.5f;
                z9Var.fragmentView.invalidate();
                return;
            default:
                this.f39379b.f42234s.invalidate();
                return;
        }
    }
}
