package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47255a;
    public final l1 f47256b;

    public g1(l1 l1Var, int i10) {
        this.f47255a = i10;
        this.f47256b = l1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47255a) {
            case 0:
                l1 l1Var = this.f47256b;
                l1Var.getClass();
                l1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.container.invalidate();
                return;
            default:
                l1 l1Var2 = this.f47256b;
                l1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(l1Var2.O0[0].getHeight(), l1Var2.O0[1].getHeight(), floatValue);
                l1Var2.N0.requestLayout();
                return;
        }
    }
}
