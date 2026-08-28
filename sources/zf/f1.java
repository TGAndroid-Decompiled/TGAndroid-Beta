package zf;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50506a;
    public final k1 f50507b;

    public f1(k1 k1Var, int i9) {
        this.f50506a = i9;
        this.f50507b = k1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50506a) {
            case 0:
                k1 k1Var = this.f50507b;
                k1Var.getClass();
                k1Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.container.invalidate();
                return;
            default:
                k1 k1Var2 = this.f50507b;
                k1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var2.J0.getLayoutParams().height = AndroidUtilities.lerp(k1Var2.K0[0].getHeight(), k1Var2.K0[1].getHeight(), floatValue);
                k1Var2.J0.requestLayout();
                return;
        }
    }
}
