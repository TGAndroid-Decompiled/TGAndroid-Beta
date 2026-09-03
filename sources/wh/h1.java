package wh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49802a;
    public final z1 f49803b;

    public h1(z1 z1Var, int i10) {
        this.f49802a = i10;
        this.f49803b = z1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49802a) {
            case 0:
                z1 z1Var = this.f49803b;
                z1Var.getClass();
                z1Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.f0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1 z1Var2 = this.f49803b;
                z1Var2.F = floatValue;
                z1Var2.v0();
                z1Var2.M.setTranslationX(AndroidUtilities.lerp(z1Var2.D[0] - z1Var2.E[0], 0, z1Var2.F));
                z1Var2.M.setTranslationY(AndroidUtilities.lerp(z1Var2.D[1] - z1Var2.E[1], 0, z1Var2.F));
                z1Var2.L.invalidate();
                return;
        }
    }
}
