package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46276a;
    public final l1 f46277b;

    public f1(l1 l1Var, int i10) {
        this.f46276a = i10;
        this.f46277b = l1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46276a) {
            case 0:
                l1 l1Var = this.f46277b;
                l1Var.getClass();
                l1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.container.invalidate();
                return;
            default:
                l1 l1Var2 = this.f46277b;
                l1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(l1Var2.O0[0].getHeight(), l1Var2.O0[1].getHeight(), floatValue);
                l1Var2.N0.requestLayout();
                return;
        }
    }
}
