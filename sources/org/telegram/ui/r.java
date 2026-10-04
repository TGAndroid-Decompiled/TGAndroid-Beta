package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f39862a;
    public final i4 f39863b;

    public r(i4 i4Var, int i10) {
        this.f39862a = i10;
        this.f39863b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39862a) {
            case 0:
                i4 i4Var = this.f39863b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f39863b;
                i4Var2.Y0 = floatValue;
                i4Var2.f37271q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f37270p0);
                return;
        }
    }
}
