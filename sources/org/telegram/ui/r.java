package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f36161a;
    public final j4 f36162b;

    public r(j4 j4Var, int i10) {
        this.f36161a = i10;
        this.f36162b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36161a) {
            case 0:
                j4 j4Var = this.f36162b;
                j4Var.getClass();
                j4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4 j4Var2 = this.f36162b;
                j4Var2.Y0 = floatValue;
                j4Var2.f33916q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + j4Var2.f33915p0);
                return;
        }
    }
}
