package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41160a;
    public final r71 f41161b;
    public final boolean f41162c;

    public w51(r71 r71Var, boolean z10, int i10) {
        this.f41160a = i10;
        this.f41161b = r71Var;
        this.f41162c = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41160a) {
            case 0:
                r71 r71Var = this.f41161b;
                o61 o61Var = r71Var.f39637h0;
                e61 e61Var = r71Var.f39639i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f41162c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                o61Var.setAlpha(f7);
                o61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                e61Var.setAlpha(floatValue);
                e61Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                r71Var.f39641j0.setAlpha(e61Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f41162c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r71 r71Var2 = this.f41161b;
                r71Var2.f39641j0.setAlpha(r71Var2.f39639i0.getAlpha() * floatValue2);
                return;
        }
    }
}
