package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f41230a;
    public final i4 f41231b;

    public r(i4 i4Var, int i10) {
        this.f41230a = i10;
        this.f41231b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41230a) {
            case 0:
                i4 i4Var = this.f41231b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f41231b;
                i4Var2.Y0 = floatValue;
                i4Var2.f38511q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f38510p0);
                return;
        }
    }
}
