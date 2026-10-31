package ph;

import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import rh.v5;
public final class t3 extends ha implements us {
    public final int P1;
    public final v5 Q1;
    public final HashSet R1;
    public final yy S1;
    public final FrameLayout T1;
    public final vh.d U1;
    public z60 V1;
    public final hi.c W1;
    public final hi.c X1;
    public p51 Y1;
    public i0.c Z1;
    public boolean a2;
    public int f45316b2;

    public t3(org.telegram.ui.ActionBar.k2 r20, long r21, int r23, jg.o2 r24) {
        throw new UnsupportedOperationException("Method not decompiled: ph.t3.<init>(org.telegram.ui.ActionBar.k2, long, int, jg.o2):void");
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, false, new ag.a(this, 29), this.I0);
        this.Y1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131750258, null);
    }

    @Override
    public final r0.j1 b0(r0.j1 j1Var) {
        this.Z1 = org.telegram.messenger.i0.I0(j1Var, false);
        d1();
        return r0.j1.f46131b;
    }

    public final void d1() {
        this.f26666k1.setPadding(org.telegram.messenger.i0.L(9.0f) + this.Z1.f7765a + this.f21615t0, 0, org.telegram.messenger.i0.L(9.0f) + this.Z1.f7767c + this.f21615t0, this.Z1.d);
        i0.c cVar = this.Z1;
        int i10 = cVar.f7765a;
        int i11 = this.f21615t0;
        this.T1.setPadding(i10 + i11, 0, cVar.f7767c + i11, cVar.d);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 == zs.G3 && (p51Var = this.Y1) != null) {
            p51Var.O(true);
            if (e1()) {
                this.Q1.b();
            }
        }
    }

    @Override
    public final void dismiss() {
        zs.f(this.f21583a).n(this, zs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        tk0 tk0Var = this.f26666k1;
        if (tk0Var != null && tk0Var.G) {
            for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                if (tk0Var.getChildAt(i10) instanceof zz) {
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
                cVar.a(t6.w0(t6.f20929d6, this.I0));
            }
            hi.c cVar2 = this.X1;
            if (cVar2 != null) {
                cVar2.a(t6.w0(t6.f20872a7, this.I0));
            }
            int w02 = t6.w0(t6.f20872a7, this.I0);
            if (this.a2 && w02 == this.f45316b2) {
                return;
            }
            this.a2 = true;
            this.f45316b2 = w02;
            v0(w02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
