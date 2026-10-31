package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.q20;
import org.telegram.ui.hk;
public final class v0 implements q20 {
    public final int f52034a;
    public final u1 f52035b;

    public v0(u1 u1Var, int i10) {
        this.f52034a = i10;
        this.f52035b = u1Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f52034a;
        u1 u1Var = this.f52035b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = u1Var.f21589c;
                boolean z10 = u1Var.f52002r1;
                boolean z11 = u1Var.d;
                if (z10 != z11) {
                    u1Var.f52002r1 = z11;
                    p2Var.clearAnimation();
                    float f7 = 0.0f;
                    if (u1Var.d) {
                        int i11 = org.telegram.messenger.i0.f16026q.y;
                        int i12 = u1Var.f21596f;
                        f7 = Math.min(0.0f, Math.max(((i11 - i12) * 0.3f) - u1Var.f52005u1, (-i12) / 3.0f));
                    }
                    p2Var.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20561w).start();
                    return;
                }
                return;
            case 1:
                hk hkVar = u1Var.f51997m1;
                ValueAnimator valueAnimator = hkVar.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && hkVar.getCurrentPosition() != num.intValue()) {
                    hkVar.E(num.intValue());
                    t1 t1Var = u1Var.f51998n1;
                    t1Var.F = num.intValue();
                    t1Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i13 = u1.f51993y1;
                u1Var.M0(intValue);
                return;
        }
    }
}
