package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41812a;
    public final n71 f41813b;
    public final boolean f41814c;

    public s51(n71 n71Var, boolean z10, int i10) {
        this.f41812a = i10;
        this.f41813b = n71Var;
        this.f41814c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41812a) {
            case 0:
                n71 n71Var = this.f41813b;
                k61 k61Var = n71Var.f40272h0;
                a61 a61Var = n71Var.f40274i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f41814c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                k61Var.setAlpha(f7);
                k61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                a61Var.setAlpha(floatValue);
                a61Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                n71Var.f40276j0.setAlpha(a61Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f41814c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                n71 n71Var2 = this.f41813b;
                n71Var2.f40276j0.setAlpha(n71Var2.f40274i0.getAlpha() * floatValue2);
                return;
        }
    }
}
