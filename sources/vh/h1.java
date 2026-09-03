package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45994a;
    public final y1 f45995b;

    public h1(y1 y1Var, int i10) {
        this.f45994a = i10;
        this.f45995b = y1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45994a) {
            case 0:
                y1 y1Var = this.f45995b;
                y1Var.getClass();
                y1Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1 y1Var2 = this.f45995b;
                y1Var2.F = floatValue;
                y1Var2.v0();
                y1Var2.M.setTranslationX(AndroidUtilities.lerp(y1Var2.D[0] - y1Var2.E[0], 0, y1Var2.F));
                y1Var2.M.setTranslationY(AndroidUtilities.lerp(y1Var2.D[1] - y1Var2.E[1], 0, y1Var2.F));
                y1Var2.L.invalidate();
                return;
        }
    }
}
