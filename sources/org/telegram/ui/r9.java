package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39685a;
    public final z9 f39686b;

    public r9(z9 z9Var, int i10) {
        this.f39685a = i10;
        this.f39686b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39685a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = this.f39686b;
                z9Var.Z = floatValue;
                z9Var.f42547a.setAlpha(1.0f - floatValue);
                if (z9Var.X == 3) {
                    z9Var.f42549b.setAlpha(1.0f - z9Var.Z);
                }
                z9Var.f42560s.setAlpha(1.0f - z9Var.Z);
                z9Var.f42561w = (z9Var.Z * 0.25f) + 0.5f;
                z9Var.fragmentView.invalidate();
                return;
            default:
                this.f39686b.f42560s.invalidate();
                return;
        }
    }
}
