package tg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48865a;
    public final m1 f48866b;

    public g1(m1 m1Var, int i10) {
        this.f48865a = i10;
        this.f48866b = m1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48865a) {
            case 0:
                m1 m1Var = this.f48866b;
                m1Var.getClass();
                m1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.container.invalidate();
                return;
            default:
                m1 m1Var2 = this.f48866b;
                m1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(m1Var2.O0[0].getHeight(), m1Var2.O0[1].getHeight(), floatValue);
                m1Var2.N0.requestLayout();
                return;
        }
    }
}
