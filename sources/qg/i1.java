package qg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40753a;
    public final m1 f40754b;

    public i1(m1 m1Var, int i10) {
        this.f40753a = i10;
        this.f40754b = m1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40753a) {
            case 0:
                m1 m1Var = this.f40754b;
                m1Var.getClass();
                m1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.container.invalidate();
                return;
            default:
                m1 m1Var2 = this.f40754b;
                m1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(m1Var2.O0[0].getHeight(), m1Var2.O0[1].getHeight(), floatValue);
                m1Var2.N0.requestLayout();
                return;
        }
    }
}
