package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43416a;
    public final y9 f43417b;

    public s9(y9 y9Var, int i10) {
        this.f43416a = i10;
        this.f43417b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43416a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f43417b;
                y9Var.Y = floatValue;
                y9Var.f45995b.setAlpha(1.0f - floatValue);
                if (y9Var.W == 3) {
                    y9Var.f45997c.setAlpha(1.0f - y9Var.Y);
                }
                y9Var.f46005s.setAlpha(1.0f - y9Var.Y);
                y9Var.f46006w = (y9Var.Y * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f43417b.f46005s.invalidate();
                return;
        }
    }
}
