package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f41081a;
    public final l4 f41082b;

    public s(l4 l4Var, int i10) {
        this.f41081a = i10;
        this.f41082b = l4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41081a) {
            case 0:
                l4 l4Var = this.f41082b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.f41082b;
                l4Var2.V0 = floatValue;
                l4Var2.f38615n0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.m0);
                return;
        }
    }
}
