package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class sc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42355a;
    public final fg0 f42356b;

    public sc0(fg0 fg0Var, int i10) {
        this.f42355a = i10;
        this.f42356b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42355a) {
            case 0:
                fg0 fg0Var = this.f42356b;
                fg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.f38155c.setAlpha(floatValue);
                fg0Var.f38155c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                fg0 fg0Var2 = this.f42356b;
                fg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.f38155c.setAlpha(floatValue2);
                fg0Var2.f38155c.setTranslationY((1.0f - floatValue2) * AndroidUtilities.dp(230.0f));
                return;
            default:
                fg0 fg0Var3 = this.f42356b;
                fg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f9 = (0.9f * floatValue3) + 0.1f;
                fg0Var3.R.setScaleX(f9);
                fg0Var3.R.setScaleY(f9);
                fg0Var3.R.setAlpha(floatValue3);
                return;
        }
    }
}
