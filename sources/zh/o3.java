package zh;

import android.widget.FrameLayout;
import bi.v9;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class o3 extends ma implements ls {
    public final int S1;
    public final v9 T1;
    public final HashSet U1;
    public final jy V1;
    public final FrameLayout W1;
    public final fi.d X1;
    public k60 Y1;
    public final ri.c Z1;
    public final ri.c f60511a2;
    public m41 f60512b2;
    public i0.b f60513c2;
    public boolean d2;
    public int f60514e2;

    public o3(org.telegram.ui.ActionBar.f2 r20, long r21, int r23, hi.d4 r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o3.<init>(org.telegram.ui.ActionBar.f2, long, int, hi.d4):void");
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, false, new p0(this, 4), this.I0);
        this.f60512b2 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131750249, null);
    }

    @Override
    public final r0.k1 b0(r0.k1 k1Var) {
        this.f60513c2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.f54212b;
    }

    public final void d1() {
        this.n1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.f60513c2.f15122a + this.f28705t0, 0, org.telegram.messenger.g0.L(9.0f) + this.f60513c2.f15124c + this.f28705t0, this.f60513c2.d);
        i0.b bVar = this.f60513c2;
        int i7 = bVar.f15122a;
        int i10 = this.f28705t0;
        this.W1.setPadding(i7 + i10, 0, bVar.f15124c + i10, bVar.d);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.G3 && (m41Var = this.f60512b2) != null) {
            m41Var.O(true);
            if (e1()) {
                this.T1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        qs.f(this.f28669a).n(this, qs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        pj0 pj0Var = this.n1;
        if (pj0Var != null && pj0Var.G) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                if (pj0Var.getChildAt(i7) instanceof lz) {
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
            ri.c cVar = this.Z1;
            if (cVar != null) {
                cVar.a(m6.w0(m6.f27890d6, this.I0));
            }
            ri.c cVar2 = this.f60511a2;
            if (cVar2 != null) {
                cVar2.a(m6.w0(m6.f27834a7, this.I0));
            }
            int w02 = m6.w0(m6.f27834a7, this.I0);
            if (this.d2 && w02 == this.f60514e2) {
                return;
            }
            this.d2 = true;
            this.f60514e2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
