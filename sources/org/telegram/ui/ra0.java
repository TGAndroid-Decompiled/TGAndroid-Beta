package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ra0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50892a;
    public final ce0 f50893b;

    public ra0(ce0 ce0Var, int i7) {
        this.f50892a = i7;
        this.f50893b = ce0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50892a) {
            case 0:
                ce0 ce0Var = this.f50893b;
                ce0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.f46078c.setAlpha(floatValue);
                ce0Var.f46078c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                ce0 ce0Var2 = this.f50893b;
                ce0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                ce0Var2.W.setScaleX(f10);
                ce0Var2.W.setScaleY(f10);
                ce0Var2.W.setAlpha(floatValue2);
                return;
            default:
                ce0 ce0Var3 = this.f50893b;
                ce0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var3.f46078c.setAlpha(floatValue3);
                ce0Var3.f46078c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
