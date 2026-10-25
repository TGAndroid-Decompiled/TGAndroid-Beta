package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43111a;
    public final gg0 f43112b;

    public rc0(gg0 gg0Var, int i10) {
        this.f43111a = i10;
        this.f43112b = gg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43111a) {
            case 0:
                gg0 gg0Var = this.f43112b;
                gg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var.f39652c.setAlpha(floatValue);
                gg0Var.f39652c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                gg0 gg0Var2 = this.f43112b;
                gg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                gg0Var2.V.setScaleX(f7);
                gg0Var2.V.setScaleY(f7);
                gg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                gg0 gg0Var3 = this.f43112b;
                gg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var3.f39652c.setAlpha(floatValue3);
                gg0Var3.f39652c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
