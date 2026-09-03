package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f40968a;
    public final l4 f40969b;

    public s(l4 l4Var, int i10) {
        this.f40968a = i10;
        this.f40969b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40968a) {
            case 0:
                l4 l4Var = this.f40969b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f40969b;
                l4Var2.V0 = floatValue;
                l4Var2.f38520n0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.m0);
                return;
        }
    }
}
