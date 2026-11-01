package ph;

import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import rh.v5;
public final class t3 extends ha implements vs {
    public final int P1;
    public final v5 Q1;
    public final HashSet R1;
    public final yy S1;
    public final FrameLayout T1;
    public final vh.d U1;
    public z60 V1;
    public final hi.c W1;
    public final hi.c X1;
    public q51 Y1;
    public i0.c Z1;
    public boolean a2;
    public int f45327b2;

    public t3(org.telegram.ui.ActionBar.k2 r20, long r21, int r23, jg.o2 r24) {
        throw new UnsupportedOperationException("Method not decompiled: ph.t3.<init>(org.telegram.ui.ActionBar.k2, long, int, jg.o2):void");
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, false, new ag.a(this, 29), this.I0);
        this.Y1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131750258, null);
    }

    @Override
    public final r0.j1 b0(r0.j1 j1Var) {
        this.Z1 = org.telegram.messenger.i0.I0(j1Var, false);
        d1();
        return r0.j1.f46142b;
    }

    public final void d1() {
        this.f26724k1.setPadding(org.telegram.messenger.i0.L(9.0f) + this.Z1.f7766a + this.f21616t0, 0, org.telegram.messenger.i0.L(9.0f) + this.Z1.f7768c + this.f21616t0, this.Z1.d);
        i0.c cVar = this.Z1;
        int i10 = cVar.f7766a;
        int i11 = this.f21616t0;
        this.T1.setPadding(i10 + i11, 0, cVar.f7768c + i11, cVar.d);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        q51 q51Var;
        if (i10 == at.G3 && (q51Var = this.Y1) != null) {
            q51Var.O(true);
            if (e1()) {
                this.Q1.b();
            }
        }
    }

    @Override
    public final void dismiss() {
        at.f(this.f21584a).n(this, at.G3);
        super.dismiss();
    }

    public final boolean e1() {
        uk0 uk0Var = this.f26724k1;
        if (uk0Var != null && uk0Var.G) {
            for (int i10 = 0; i10 < uk0Var.getChildCount(); i10++) {
                if (uk0Var.getChildAt(i10) instanceof zz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            hi.c cVar = this.W1;
            if (cVar != null) {
                cVar.a(t6.w0(t6.f20930d6, this.I0));
            }
            hi.c cVar2 = this.X1;
            if (cVar2 != null) {
                cVar2.a(t6.w0(t6.f20873a7, this.I0));
            }
            int w02 = t6.w0(t6.f20873a7, this.I0);
            if (this.a2 && w02 == this.f45327b2) {
                return;
            }
            this.a2 = true;
            this.f45327b2 = w02;
            v0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
