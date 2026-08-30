package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38840a;
    public final q61 f38841b;
    public final boolean f38842c;

    public u41(q61 q61Var, boolean z4, int i10) {
        this.f38840a = i10;
        this.f38841b = q61Var;
        this.f38842c = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38840a) {
            case 0:
                q61 q61Var = this.f38841b;
                m51 m51Var = q61Var.f37605e0;
                b51 b51Var = q61Var.f37608f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f38842c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                m51Var.setAlpha(f10);
                m51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                b51Var.setAlpha(floatValue);
                b51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                q61Var.f37610g0.setAlpha(b51Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.f38842c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q61 q61Var2 = this.f38841b;
                q61Var2.f37610g0.setAlpha(q61Var2.f37608f0.getAlpha() * floatValue2);
                return;
        }
    }
}
