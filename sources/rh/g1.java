package rh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class g1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f47148a;

    public final x1 f47149b;

    public g1(x1 x1Var, int i10) {
        this.f47148a = i10;
        this.f47149b = x1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47148a) {
            case 0:
                x1 x1Var = this.f47149b;
                x1Var.getClass();
                x1Var.M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.f0();
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1 x1Var2 = this.f47149b;
                x1Var2.E = fFloatValue;
                x1Var2.v0();
                x1Var2.L.setTranslationX(AndroidUtilities.lerp(x1Var2.C[0] - x1Var2.D[0], 0, x1Var2.E));
                x1Var2.L.setTranslationY(AndroidUtilities.lerp(x1Var2.C[1] - x1Var2.D[1], 0, x1Var2.E));
                x1Var2.K.invalidate();
                break;
        }
    }
}
