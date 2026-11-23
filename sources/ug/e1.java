package ug;

import android.animation.ValueAnimator;
public final class e1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f58770a;
    public final h1 f58771b;

    public e1(h1 h1Var, int i7) {
        this.f58770a = i7;
        this.f58771b = h1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58770a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var = this.f58771b;
                h1Var.C2 = floatValue;
                h1Var.f30229c.invalidate();
                return;
            default:
                h1 h1Var2 = this.f58771b;
                h1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, h1Var2.K2[0].getHeight(), h1Var2.K2[1].getHeight());
                h1Var2.J2.requestLayout();
                return;
        }
    }
}
