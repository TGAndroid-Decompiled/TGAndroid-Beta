package th;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class w6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49604a;
    public final o7 f49605b;

    public w6(o7 o7Var, int i10) {
        this.f49604a = i10;
        this.f49605b = o7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z2 currentPeerView;
        switch (this.f49604a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var = this.f49605b;
                o7Var.U = floatValue;
                o7Var.B();
                c7 c7Var = o7Var.f49344s;
                if (c7Var != null) {
                    c7Var.invalidate();
                }
                s0 s0Var = o7Var.A0;
                if (s0Var != null) {
                    s0Var.v((1.0f - o7Var.V) * o7Var.U);
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var2 = this.f49605b;
                o7Var2.U = floatValue2;
                d7 d7Var = o7Var2.f49353w;
                if (d7Var != null && floatValue2 > 0.6f && p.f49362c && d7Var.f49363a) {
                    d7Var.a(false);
                }
                s0 s0Var2 = o7Var2.A0;
                if (s0Var2 != null) {
                    s0Var2.v((1.0f - o7Var2.V) * o7Var2.U);
                }
                o7Var2.B();
                c7 c7Var2 = o7Var2.f49344s;
                if (c7Var2 != null) {
                    c7Var2.invalidate();
                    return;
                }
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var3 = this.f49605b;
                o7Var3.Z = floatValue3;
                o7Var3.f49313d0 = Utilities.i(o7Var3.Z / org.telegram.messenger.i0.L(200.0f), 1.0f, 0.0f);
                e7 e7Var = o7Var3.f49333n0;
                if (e7Var == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = e7Var.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var4 = this.f49605b;
                o7Var4.f49315e0 = floatValue4;
                o7Var4.f49353w.invalidate();
                return;
        }
    }
}
