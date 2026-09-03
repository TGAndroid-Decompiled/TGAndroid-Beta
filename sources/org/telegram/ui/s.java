package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f38079a;
    public final n4 f38080b;

    public s(n4 n4Var, int i10) {
        this.f38079a = i10;
        this.f38080b = n4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38079a) {
            case 0:
                n4 n4Var = this.f38080b;
                n4Var.getClass();
                n4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4 n4Var2 = this.f38080b;
                n4Var2.V0 = floatValue;
                n4Var2.f36371n0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + n4Var2.m0);
                return;
        }
    }
}
