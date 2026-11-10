package org.telegram.ui;

import android.animation.ValueAnimator;
public final class ua0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50446a;
    public final fe0 f50447b;

    public ua0(fe0 fe0Var, int i7) {
        this.f50446a = i7;
        this.f50447b = fe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50446a) {
            case 0:
                fe0 fe0Var = this.f50447b;
                fe0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var.f45696c.setAlpha(floatValue);
                fe0Var.f45696c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                return;
            case 1:
                fe0 fe0Var2 = this.f50447b;
                fe0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                fe0Var2.V.setScaleX(f10);
                fe0Var2.V.setScaleY(f10);
                fe0Var2.V.setAlpha(floatValue2);
                return;
            default:
                fe0 fe0Var3 = this.f50447b;
                fe0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe0Var3.f45696c.setAlpha(floatValue3);
                fe0Var3.f45696c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                return;
        }
    }
}
