package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f37135a;
    public final i4 f37136b;

    public r(i4 i4Var, int i10) {
        this.f37135a = i10;
        this.f37136b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37135a) {
            case 0:
                i4 i4Var = this.f37136b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f37136b;
                i4Var2.Y0 = floatValue;
                i4Var2.f34390q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f34389p0);
                return;
        }
    }
}
