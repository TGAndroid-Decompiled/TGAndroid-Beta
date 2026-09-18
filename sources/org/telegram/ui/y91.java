package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class y91 extends s4.s0 {
    public final int f39762a;
    public final za1 f39763b;

    public y91(za1 za1Var, int i10) {
        this.f39762a = i10;
        this.f39763b = za1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        za1 za1Var;
        ah.i iVar2;
        za1 za1Var2;
        ah.i iVar3;
        switch (this.f39762a) {
            case 0:
                za1 za1Var3 = this.f39763b;
                if (za1Var3.f40054r0.size() != za1Var3.f40056s0.size() && !za1Var3.f40061w0 && za1Var3.U.N0() > za1Var3.X.f33245c0 - 20) {
                    za1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = za1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    za1.W(za1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (za1Var = this.f39763b).C0) != null) {
                    iVar2.f(i10, i11);
                    za1.W(za1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (za1Var2 = this.f39763b).C0) != null) {
                    iVar3.f(i10, i11);
                    za1.W(za1Var2);
                    return;
                }
                return;
        }
    }
}
