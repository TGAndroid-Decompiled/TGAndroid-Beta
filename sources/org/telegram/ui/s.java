package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f42238a;
    public final m4 f42239b;

    public s(m4 m4Var, int i10) {
        this.f42238a = i10;
        this.f42239b = m4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42238a) {
            case 0:
                m4 m4Var = this.f42239b;
                m4Var.getClass();
                m4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4 m4Var2 = this.f42239b;
                m4Var2.U0 = floatValue;
                m4Var2.m0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + m4Var2.f40400l0);
                return;
        }
    }
}
