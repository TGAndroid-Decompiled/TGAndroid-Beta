package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f37147a;
    public final i4 f37148b;

    public r(i4 i4Var, int i10) {
        this.f37147a = i10;
        this.f37148b = i4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37147a) {
            case 0:
                i4 i4Var = this.f37148b;
                i4Var.getClass();
                i4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4 i4Var2 = this.f37148b;
                i4Var2.Y0 = floatValue;
                i4Var2.f34403q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + i4Var2.f34402p0);
                return;
        }
    }
}
