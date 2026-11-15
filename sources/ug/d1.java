package ug;

import android.animation.ValueAnimator;
public final class d1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f58061a;
    public final g1 f58062b;

    public d1(g1 g1Var, int i7) {
        this.f58061a = i7;
        this.f58062b = g1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58061a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1 g1Var = this.f58062b;
                g1Var.C2 = floatValue;
                g1Var.f29685c.invalidate();
                return;
            default:
                g1 g1Var2 = this.f58062b;
                g1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, g1Var2.K2[0].getHeight(), g1Var2.K2[1].getHeight());
                g1Var2.J2.requestLayout();
                return;
        }
    }
}
