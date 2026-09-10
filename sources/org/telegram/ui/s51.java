package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36556a;
    public final l71 f36557b;
    public final boolean f36558c;

    public s51(l71 l71Var, boolean z10, int i10) {
        this.f36556a = i10;
        this.f36557b = l71Var;
        this.f36558c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36556a) {
            case 0:
                l71 l71Var = this.f36557b;
                i61 i61Var = l71Var.f34570h0;
                y51 y51Var = l71Var.f34572i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36558c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                i61Var.setAlpha(f7);
                i61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                y51Var.setAlpha(floatValue);
                y51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                l71Var.f34574j0.setAlpha(y51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f36558c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                l71 l71Var2 = this.f36557b;
                l71Var2.f34574j0.setAlpha(l71Var2.f34572i0.getAlpha() * floatValue2);
                return;
        }
    }
}
