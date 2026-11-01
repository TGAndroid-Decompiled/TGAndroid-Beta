package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zb0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43884a;
    public final gf0 f43885b;

    public zb0(gf0 gf0Var, int i10) {
        this.f43884a = i10;
        this.f43885b = gf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43884a) {
            case 0:
                gf0 gf0Var = this.f43885b;
                gf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf0Var.f37475c.setAlpha(floatValue);
                gf0Var.f37475c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.i0.L(230.0f));
                return;
            case 1:
                gf0 gf0Var2 = this.f43885b;
                gf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                gf0Var2.V.setScaleX(f7);
                gf0Var2.V.setScaleY(f7);
                gf0Var2.V.setAlpha(floatValue2);
                return;
            default:
                gf0 gf0Var3 = this.f43885b;
                gf0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf0Var3.f37475c.setAlpha(floatValue3);
                gf0Var3.f37475c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.i0.L(230.0f));
                return;
        }
    }
}
