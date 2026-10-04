package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46116a;
    public final m1 f46117b;

    public g1(m1 m1Var, int i10) {
        this.f46116a = i10;
        this.f46117b = m1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46116a) {
            case 0:
                m1 m1Var = this.f46117b;
                m1Var.getClass();
                m1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.container.invalidate();
                return;
            default:
                m1 m1Var2 = this.f46117b;
                m1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(m1Var2.O0[0].getHeight(), m1Var2.O0[1].getHeight(), floatValue);
                m1Var2.N0.requestLayout();
                return;
        }
    }
}
