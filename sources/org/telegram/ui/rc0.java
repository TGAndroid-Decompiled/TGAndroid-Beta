package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40698a;
    public final fg0 f40699b;

    public rc0(fg0 fg0Var, int i10) {
        this.f40698a = i10;
        this.f40699b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40698a) {
            case 0:
                fg0 fg0Var = this.f40699b;
                fg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.f36907c.setAlpha(floatValue);
                fg0Var.f36907c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                fg0 fg0Var2 = this.f40699b;
                fg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                fg0Var2.V.setScaleX(f7);
                fg0Var2.V.setScaleY(f7);
                fg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                fg0 fg0Var3 = this.f40699b;
                fg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var3.f36907c.setAlpha(floatValue3);
                fg0Var3.f36907c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
