package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f37146a;
    public final i4 f37147b;

    public r(i4 i4Var, int i10) {
        this.f37146a = i10;
        this.f37147b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37146a) {
            case 0:
                i4 i4Var = this.f37147b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f37147b;
                i4Var2.Y0 = floatValue;
                i4Var2.f34402q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f34401p0);
                return;
        }
    }
}
