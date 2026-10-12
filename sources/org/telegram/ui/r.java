package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f41458a;
    public final i4 f41459b;

    public r(i4 i4Var, int i10) {
        this.f41458a = i10;
        this.f41459b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41458a) {
            case 0:
                i4 i4Var = this.f41459b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f41459b;
                i4Var2.Y0 = floatValue;
                i4Var2.f38657q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f38656p0);
                return;
        }
    }
}
