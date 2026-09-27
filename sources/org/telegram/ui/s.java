package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f37253a;
    public final j4 f37254b;

    public s(j4 j4Var, int i10) {
        this.f37253a = i10;
        this.f37254b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37253a) {
            case 0:
                j4 j4Var = this.f37254b;
                j4Var.getClass();
                j4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4 j4Var2 = this.f37254b;
                j4Var2.Y0 = floatValue;
                j4Var2.f34623q0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + j4Var2.f34622p0);
                return;
        }
    }
}
