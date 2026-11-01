package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.r20;
import org.telegram.ui.hk;
public final class w0 implements r20 {
    public final int f52100a;
    public final u1 f52101b;

    public w0(u1 u1Var, int i10) {
        this.f52100a = i10;
        this.f52101b = u1Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f52100a;
        u1 u1Var = this.f52101b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = u1Var.f21590c;
                boolean z10 = u1Var.f52009r1;
                boolean z11 = u1Var.d;
                if (z10 != z11) {
                    u1Var.f52009r1 = z11;
                    p2Var.clearAnimation();
                    float f7 = 0.0f;
                    if (u1Var.d) {
                        int i11 = org.telegram.messenger.i0.f16172q.y;
                        int i12 = u1Var.f21597f;
                        f7 = Math.min(0.0f, Math.max(((i11 - i12) * 0.3f) - u1Var.f52012u1, (-i12) / 3.0f));
                    }
                    p2Var.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20562w).start();
                    return;
                }
                return;
            case 1:
                hk hkVar = u1Var.f52004m1;
                ValueAnimator valueAnimator = hkVar.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && hkVar.getCurrentPosition() != num.intValue()) {
                    hkVar.E(num.intValue());
                    t1 t1Var = u1Var.f52005n1;
                    t1Var.F = num.intValue();
                    t1Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i13 = u1.f52000y1;
                u1Var.M0(intValue);
                return;
        }
    }
}
