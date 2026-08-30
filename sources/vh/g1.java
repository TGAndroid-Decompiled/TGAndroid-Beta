package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45897a;
    public final y1 f45898b;

    public g1(y1 y1Var, int i10) {
        this.f45897a = i10;
        this.f45898b = y1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45897a) {
            case 0:
                y1 y1Var = this.f45898b;
                y1Var.getClass();
                y1Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1 y1Var2 = this.f45898b;
                y1Var2.F = floatValue;
                y1Var2.v0();
                y1Var2.M.setTranslationX(AndroidUtilities.lerp(y1Var2.D[0] - y1Var2.E[0], 0, y1Var2.F));
                y1Var2.M.setTranslationY(AndroidUtilities.lerp(y1Var2.D[1] - y1Var2.E[1], 0, y1Var2.F));
                y1Var2.L.invalidate();
                return;
        }
    }
}
