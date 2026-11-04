package vg;

import android.animation.ValueAnimator;
public final class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f56582a;
    public final h1 f56583b;

    public c1(h1 h1Var, int i3) {
        this.f56582a = i3;
        this.f56583b = h1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56582a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var = this.f56583b;
                h1Var.f56648z2 = floatValue;
                h1Var.f28589c.invalidate();
                return;
            default:
                h1 h1Var2 = this.f56583b;
                h1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var2.G2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, h1Var2.H2[0].getHeight(), h1Var2.H2[1].getHeight());
                h1Var2.G2.requestLayout();
                return;
        }
    }
}
