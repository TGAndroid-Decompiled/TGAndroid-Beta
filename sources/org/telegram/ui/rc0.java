package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40689a;
    public final eg0 f40690b;

    public rc0(eg0 eg0Var, int i10) {
        this.f40689a = i10;
        this.f40690b = eg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40689a) {
            case 0:
                eg0 eg0Var = this.f40690b;
                eg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.f36493c.setAlpha(floatValue);
                eg0Var.f36493c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                eg0 eg0Var2 = this.f40690b;
                eg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                eg0Var2.V.setScaleX(f7);
                eg0Var2.V.setScaleY(f7);
                eg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                eg0 eg0Var3 = this.f40690b;
                eg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var3.f36493c.setAlpha(floatValue3);
                eg0Var3.f36493c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
