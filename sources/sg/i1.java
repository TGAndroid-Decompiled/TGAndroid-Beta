package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46116a;
    public final o1 f46117b;

    public i1(o1 o1Var, int i10) {
        this.f46116a = i10;
        this.f46117b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46116a) {
            case 0:
                o1 o1Var = this.f46117b;
                o1Var.getClass();
                o1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.container.invalidate();
                return;
            default:
                o1 o1Var2 = this.f46117b;
                o1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(o1Var2.O0[0].getHeight(), o1Var2.O0[1].getHeight(), floatValue);
                o1Var2.N0.requestLayout();
                return;
        }
    }
}
