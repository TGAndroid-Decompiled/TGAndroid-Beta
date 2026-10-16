package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40867a;
    public final r71 f40868b;
    public final boolean f40869c;

    public w51(r71 r71Var, boolean z10, int i10) {
        this.f40867a = i10;
        this.f40868b = r71Var;
        this.f40869c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40867a) {
            case 0:
                r71 r71Var = this.f40868b;
                o61 o61Var = r71Var.f39330h0;
                e61 e61Var = r71Var.f39332i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40869c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                o61Var.setAlpha(f7);
                o61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                e61Var.setAlpha(floatValue);
                e61Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                r71Var.f39334j0.setAlpha(e61Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f40869c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r71 r71Var2 = this.f40868b;
                r71Var2.f39334j0.setAlpha(r71Var2.f39332i0.getAlpha() * floatValue2);
                return;
        }
    }
}
