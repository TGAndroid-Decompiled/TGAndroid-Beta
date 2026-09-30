package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f37248a;
    public final i4 f37249b;

    public r(i4 i4Var, int i10) {
        this.f37248a = i10;
        this.f37249b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37248a) {
            case 0:
                i4 i4Var = this.f37249b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f37249b;
                i4Var2.Y0 = floatValue;
                i4Var2.f34498q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f34497p0);
                return;
        }
    }
}
