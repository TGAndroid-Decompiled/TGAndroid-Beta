package ug;

import android.animation.ValueAnimator;
public final class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f58653a;
    public final i1 f58654b;

    public f1(i1 i1Var, int i7) {
        this.f58653a = i7;
        this.f58654b = i1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58653a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1 i1Var = this.f58654b;
                i1Var.C2 = floatValue;
                i1Var.f30193c.invalidate();
                return;
            default:
                i1 i1Var2 = this.f58654b;
                i1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, i1Var2.K2[0].getHeight(), i1Var2.K2[1].getHeight());
                i1Var2.J2.requestLayout();
                return;
        }
    }
}
