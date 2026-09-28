package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class r91 extends s4.s0 {
    public final int f37272a;
    public final sa1 f37273b;

    public r91(sa1 sa1Var, int i10) {
        this.f37272a = i10;
        this.f37273b = sa1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        sa1 sa1Var;
        ah.h hVar2;
        sa1 sa1Var2;
        ah.h hVar3;
        switch (this.f37272a) {
            case 0:
                sa1 sa1Var3 = this.f37273b;
                if (sa1Var3.f37690r0.size() != sa1Var3.f37692s0.size() && !sa1Var3.f37697w0 && sa1Var3.U.N0() > sa1Var3.X.f39885c0 - 20) {
                    sa1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = sa1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    sa1.W(sa1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (sa1Var = this.f37273b).C0) != null) {
                    hVar2.f(i10, i11);
                    sa1.W(sa1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (sa1Var2 = this.f37273b).C0) != null) {
                    hVar3.f(i10, i11);
                    sa1.W(sa1Var2);
                    return;
                }
                return;
        }
    }
}
