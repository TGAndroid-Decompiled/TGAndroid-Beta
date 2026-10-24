package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class tc0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41993a;
    public final hg0 f41994b;

    public tc0(hg0 hg0Var, int i10) {
        this.f41993a = i10;
        this.f41994b = hg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41993a) {
            case 0:
                hg0 hg0Var = this.f41994b;
                hg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.f37837c.setAlpha(floatValue);
                hg0Var.f37837c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                return;
            case 1:
                hg0 hg0Var2 = this.f41994b;
                hg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                hg0Var2.V.setScaleX(f7);
                hg0Var2.V.setScaleY(f7);
                hg0Var2.V.setAlpha(floatValue2);
                return;
            default:
                hg0 hg0Var3 = this.f41994b;
                hg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var3.f37837c.setAlpha(floatValue3);
                hg0Var3.f37837c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                return;
        }
    }
}
