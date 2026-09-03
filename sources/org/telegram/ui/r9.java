package org.telegram.ui;

import android.animation.ValueAnimator;
public final class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37745a;
    public final x9 f37746b;

    public r9(x9 x9Var, int i10) {
        this.f37745a = i10;
        this.f37746b = x9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37745a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = this.f37746b;
                x9Var.U = floatValue;
                x9Var.f39926a.setAlpha(1.0f - floatValue);
                if (x9Var.S == 3) {
                    x9Var.f39928b.setAlpha(1.0f - x9Var.U);
                }
                x9Var.f39933r.setAlpha(1.0f - x9Var.U);
                x9Var.v = (x9Var.U * 0.25f) + 0.5f;
                x9Var.fragmentView.invalidate();
                return;
            default:
                this.f37746b.f39933r.invalidate();
                return;
        }
    }
}
