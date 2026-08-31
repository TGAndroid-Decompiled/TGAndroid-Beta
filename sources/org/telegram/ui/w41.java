package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42377a;
    public final r61 f42378b;
    public final boolean f42379c;

    public w41(r61 r61Var, boolean z4, int i10) {
        this.f42377a = i10;
        this.f42378b = r61Var;
        this.f42379c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42377a) {
            case 0:
                r61 r61Var = this.f42378b;
                o51 o51Var = r61Var.f40791e0;
                d51 d51Var = r61Var.f40794f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f42379c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o51Var.setAlpha(f10);
                o51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                d51Var.setAlpha(floatValue);
                d51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                r61Var.f40796g0.setAlpha(d51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f42379c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r61 r61Var2 = this.f42378b;
                r61Var2.f40796g0.setAlpha(r61Var2.f40794f0.getAlpha() * floatValue2);
                return;
        }
    }
}
