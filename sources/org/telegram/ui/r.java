package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f41462a;
    public final i4 f41463b;

    public r(i4 i4Var, int i10) {
        this.f41462a = i10;
        this.f41463b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41462a) {
            case 0:
                i4 i4Var = this.f41463b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f41463b;
                i4Var2.Y0 = floatValue;
                i4Var2.f38660q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f38659p0);
                return;
        }
    }
}
