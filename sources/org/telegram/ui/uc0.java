package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class uc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42372a;
    public final ig0 f42373b;

    public uc0(ig0 ig0Var, int i10) {
        this.f42372a = i10;
        this.f42373b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42372a) {
            case 0:
                ig0 ig0Var = this.f42373b;
                ig0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.f38196c.setAlpha(floatValue);
                ig0Var.f38196c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                ig0 ig0Var2 = this.f42373b;
                ig0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                ig0Var2.V.setScaleX(f7);
                ig0Var2.V.setScaleY(f7);
                ig0Var2.V.setAlpha(floatValue2);
                return;
            default:
                ig0 ig0Var3 = this.f42373b;
                ig0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var3.f38196c.setAlpha(floatValue3);
                ig0Var3.f38196c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
