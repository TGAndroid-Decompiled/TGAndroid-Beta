package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42609a;
    public final k1 f42610b;

    public f1(k1 k1Var, int i10) {
        this.f42609a = i10;
        this.f42610b = k1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42609a) {
            case 0:
                k1 k1Var = this.f42610b;
                k1Var.getClass();
                k1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.container.invalidate();
                return;
            default:
                k1 k1Var2 = this.f42610b;
                k1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(k1Var2.O0[0].getHeight(), k1Var2.O0[1].getHeight(), floatValue);
                k1Var2.N0.requestLayout();
                return;
        }
    }
}
