package org.telegram.ui;

import android.animation.ValueAnimator;
public final class s9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43413a;
    public final y9 f43414b;

    public s9(y9 y9Var, int i10) {
        this.f43413a = i10;
        this.f43414b = y9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43413a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.f43414b;
                y9Var.Y = floatValue;
                y9Var.f45992b.setAlpha(1.0f - floatValue);
                if (y9Var.W == 3) {
                    y9Var.f45994c.setAlpha(1.0f - y9Var.Y);
                }
                y9Var.f46002s.setAlpha(1.0f - y9Var.Y);
                y9Var.f46003w = (y9Var.Y * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                this.f43414b.f46002s.invalidate();
                return;
        }
    }
}
