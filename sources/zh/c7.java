package zh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48329a;
    public final u7 f48330b;

    public c7(u7 u7Var, int i10) {
        this.f48329a = i10;
        this.f48330b = u7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a3 currentPeerView;
        switch (this.f48329a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var = this.f48330b;
                u7Var.U = floatValue;
                u7Var.o();
                i7 i7Var = u7Var.f48958s;
                if (i7Var != null) {
                    i7Var.invalidate();
                }
                t0 t0Var = u7Var.A0;
                if (t0Var != null) {
                    t0Var.v((1.0f - u7Var.V) * u7Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var2 = this.f48330b;
                u7Var2.U = floatValue2;
                j7 j7Var = u7Var2.v;
                if (j7Var != null && floatValue2 > 0.6f && p.f48762c && j7Var.f48763a) {
                    j7Var.a(false);
                }
                t0 t0Var2 = u7Var2.A0;
                if (t0Var2 != null) {
                    t0Var2.v((1.0f - u7Var2.V) * u7Var2.U);
                }
                u7Var2.o();
                i7 i7Var2 = u7Var2.f48958s;
                if (i7Var2 != null) {
                    i7Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var3 = this.f48330b;
                u7Var3.Z = floatValue3;
                u7Var3.f48927d0 = Utilities.clamp(u7Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                k7 k7Var = u7Var3.f48947n0;
                if (k7Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = k7Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var4 = this.f48330b;
                u7Var4.f48929e0 = floatValue4;
                u7Var4.v.invalidate();
                return;
        }
    }
}
