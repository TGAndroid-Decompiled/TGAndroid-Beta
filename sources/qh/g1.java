package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46400a;
    public final x1 f46401b;

    public g1(x1 x1Var, int i9) {
        this.f46400a = i9;
        this.f46401b = x1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46400a) {
            case 0:
                x1 x1Var = this.f46401b;
                x1Var.getClass();
                x1Var.M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.e0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1 x1Var2 = this.f46401b;
                x1Var2.E = floatValue;
                x1Var2.u0();
                x1Var2.L.setTranslationX(AndroidUtilities.lerp(x1Var2.C[0] - x1Var2.D[0], 0, x1Var2.E));
                x1Var2.L.setTranslationY(AndroidUtilities.lerp(x1Var2.C[1] - x1Var2.D[1], 0, x1Var2.E));
                x1Var2.K.invalidate();
                return;
        }
    }
}
