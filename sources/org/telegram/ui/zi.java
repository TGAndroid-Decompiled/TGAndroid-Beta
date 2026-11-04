package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class zi extends u4.t {
    public boolean S;
    public final wm T;

    public zi(wm wmVar, boolean z10) {
        super(z10);
        this.T = wmVar;
    }

    @Override
    public final boolean B1(int i3) {
        int i10;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.ui s92;
        byte b10;
        wm wmVar = this.T;
        fl flVar = wmVar.D0;
        int i11 = flVar.K;
        if (i3 >= i11 && i3 < flVar.L && (i10 = i3 - i11) >= 0 && i10 < flVar.L().size() && (s92 = wmVar.s9((ziVar = (org.telegram.messenger.zi) wmVar.D0.L().get(i10)))) != null) {
            ArrayList arrayList = s92.f25702e;
            org.telegram.messenger.ri d = s92.d(ziVar);
            if (d.f25140a != d.f25141b && (b10 = d.f25142c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) arrayList.get(i12);
                    if (riVar != d) {
                        byte b11 = riVar.f25142c;
                        byte b12 = d.f25142c;
                        if (b11 <= b12 && riVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.M9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.M9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f55640n - this.T.M9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.M9;
    }

    @Override
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.f25040a;
        try {
            super.b0(eVar, a1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new xg(this, 4));
        }
    }

    @Override
    public final void i1(int i3, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.M9);
        }
        super.i1(i3, i10, z10);
    }

    @Override
    public final int j(u4.a1 a1Var) {
        this.S = true;
        int B0 = B0(a1Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(u4.a1 a1Var) {
        this.S = true;
        int C0 = C0(a1Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(u4.a1 a1Var) {
        this.S = true;
        int D0 = D0(a1Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, tf.e r12, u4.a1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zi.o0(int, tf.e, u4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        this.T.Ma = false;
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.f55704a = i3;
        w0(mVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
