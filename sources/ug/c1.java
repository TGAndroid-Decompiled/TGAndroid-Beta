package ug;

import android.animation.ValueAnimator;
public final class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f56549a;
    public final f1 f56550b;

    public c1(f1 f1Var, int i7) {
        this.f56549a = i7;
        this.f56550b = f1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56549a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1 f1Var = this.f56550b;
                f1Var.f56598y2 = floatValue;
                f1Var.f28627c.invalidate();
                return;
            default:
                f1 f1Var2 = this.f56550b;
                f1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f1Var2.F2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, f1Var2.G2[0].getHeight(), f1Var2.G2[1].getHeight());
                f1Var2.F2.requestLayout();
                return;
        }
    }
}
