package th;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48448a;
    public final x1 f48449b;

    public g1(x1 x1Var, int i10) {
        this.f48448a = i10;
        this.f48449b = x1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48448a) {
            case 0:
                x1 x1Var = this.f48449b;
                x1Var.getClass();
                x1Var.M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1 x1Var2 = this.f48449b;
                x1Var2.E = floatValue;
                x1Var2.v0();
                x1Var2.L.setTranslationX(AndroidUtilities.lerp(x1Var2.C[0] - x1Var2.D[0], 0, x1Var2.E));
                x1Var2.L.setTranslationY(AndroidUtilities.lerp(x1Var2.C[1] - x1Var2.D[1], 0, x1Var2.E));
                x1Var2.K.invalidate();
                return;
        }
    }
}
