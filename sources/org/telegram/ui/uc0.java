package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class uc0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f43185a;

    public final ig0 f43186b;

    public uc0(ig0 ig0Var, int i10) {
        this.f43185a = i10;
        this.f43186b = ig0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43185a) {
            case 0:
                ig0 ig0Var = this.f43186b;
                ig0Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.f39083c.setAlpha(fFloatValue);
                ig0Var.f39083c.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                ig0 ig0Var2 = this.f43186b;
                ig0Var2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.f39083c.setAlpha(fFloatValue2);
                ig0Var2.f39083c.setTranslationY((1.0f - fFloatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                ig0 ig0Var3 = this.f43186b;
                ig0Var3.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * fFloatValue3) + 0.1f;
                ig0Var3.R.setScaleX(f10);
                ig0Var3.R.setScaleY(f10);
                ig0Var3.R.setAlpha(fFloatValue3);
                break;
        }
    }
}
