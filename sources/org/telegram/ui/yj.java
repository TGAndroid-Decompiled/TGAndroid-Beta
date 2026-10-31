package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class yj extends s4.s {
    public boolean S;
    public final un T;

    public yj(un unVar, boolean z10) {
        super(z10);
        this.T = unVar;
    }

    @Override
    public final boolean B1(int i10) {
        int i11;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.ej k92;
        byte b10;
        un unVar = this.T;
        fm fmVar = unVar.C0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (k92 = unVar.k9((jjVar = (org.telegram.messenger.jj) unVar.C0.L().get(i11)))) != null) {
            ArrayList arrayList = k92.e;
            org.telegram.messenger.bj d = k92.d(jjVar);
            if (d.f14775a != d.f14776b && (b10 = d.f14777c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) arrayList.get(i13);
                    if (bjVar != d) {
                        byte b11 = bjVar.f14777c;
                        byte b12 = d.f14777c;
                        if (b11 <= b12 && bjVar.d >= b12) {
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
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override
    public final int G() {
        if (this.S) {
            return (int) this.T.L9;
        }
        return 0;
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) this.T.L9;
        }
        return F();
    }

    @Override
    public final int K() {
        if (this.S) {
            return (int) ((this.f47988n - this.T.L9) - C());
        }
        return super.K();
    }

    @Override
    public final int X0() {
        return (int) this.T.L9;
    }

    @Override
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.f18448a;
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new rh(this, 4));
        }
    }

    @Override
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.L9);
        }
        super.i1(i10, i11, z10);
    }

    @Override
    public final int j(s4.z0 z0Var) {
        this.S = true;
        int B0 = B0(z0Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int k(s4.z0 z0Var) {
        this.S = true;
        int C0 = C0(z0Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int l(s4.z0 z0Var) {
        this.S = true;
        int D0 = D0(z0Var);
        this.S = false;
        return D0;
    }

    @Override
    public final int o0(int r11, hf.e r12, s4.z0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj.o0(int, hf.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        this.T.La = false;
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.f48045a = i10;
        w0(pVar);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
