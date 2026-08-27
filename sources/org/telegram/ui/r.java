package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class r implements ValueAnimator.AnimatorUpdateListener {

    public final int f41771a;

    public final m4 f41772b;

    public r(m4 m4Var, int i10) {
        this.f41771a = i10;
        this.f41772b = m4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41771a) {
            case 0:
                m4 m4Var = this.f41772b;
                m4Var.getClass();
                m4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4 m4Var2 = this.f41772b;
                m4Var2.U0 = fFloatValue;
                m4Var2.m0.setTranslationY(((1.0f - fFloatValue) * AndroidUtilities.dp(51.0f)) + m4Var2.f40343l0);
                break;
        }
    }
}
