package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46144a;
    public final o1 f46145b;

    public i1(o1 o1Var, int i10) {
        this.f46144a = i10;
        this.f46145b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46144a) {
            case 0:
                o1 o1Var = this.f46145b;
                o1Var.getClass();
                o1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.container.invalidate();
                return;
            default:
                o1 o1Var2 = this.f46145b;
                o1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(o1Var2.O0[0].getHeight(), o1Var2.O0[1].getHeight(), floatValue);
                o1Var2.N0.requestLayout();
                return;
        }
    }
}
