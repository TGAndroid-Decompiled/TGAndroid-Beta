package zh;

import android.widget.FrameLayout;
import bi.v9;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
public final class o3 extends na implements ls {
    public final int P1;
    public final v9 Q1;
    public final HashSet R1;
    public final ky S1;
    public final FrameLayout T1;
    public final fi.d U1;
    public l60 V1;
    public final ri.c W1;
    public final ri.c X1;
    public m41 Y1;
    public i0.b Z1;
    public boolean f60504a2;
    public int f60505b2;

    public o3(org.telegram.ui.ActionBar.f2 r20, long r21, int r23, hi.d4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o3.<init>(org.telegram.ui.ActionBar.f2, long, int, hi.d4):void");
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.f28621a, 0, false, new p0(this, 4), this.I0);
        this.Y1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131750249, null);
    }

    @Override
    public final r0.k1 b0(r0.k1 k1Var) {
        this.Z1 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.f54213b;
    }

    public final void d1() {
        this.f36303k1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.Z1.f15120a + this.f28654t0, 0, org.telegram.messenger.g0.L(9.0f) + this.Z1.f15122c + this.f28654t0, this.Z1.d);
        i0.b bVar = this.Z1;
        int i7 = bVar.f15120a;
        int i10 = this.f28654t0;
        this.T1.setPadding(i7 + i10, 0, bVar.f15122c + i10, bVar.d);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.G3 && (m41Var = this.Y1) != null) {
            m41Var.O(true);
            if (e1()) {
                this.Q1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        qs.f(this.f28621a).n(this, qs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        qj0 qj0Var = this.f36303k1;
        if (qj0Var != null && qj0Var.G) {
            for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
                if (qj0Var.getChildAt(i7) instanceof mz) {
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
            ri.c cVar = this.W1;
            if (cVar != null) {
                cVar.a(l6.w0(l6.f27865d6, this.I0));
            }
            ri.c cVar2 = this.X1;
            if (cVar2 != null) {
                cVar2.a(l6.w0(l6.f27809a7, this.I0));
            }
            int w02 = l6.w0(l6.f27809a7, this.I0);
            if (this.f60504a2 && w02 == this.f60505b2) {
                return;
            }
            this.f60504a2 = true;
            this.f60505b2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
