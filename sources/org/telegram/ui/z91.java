package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class z91 extends s4.s0 {
    public final int f40195a;
    public final ab1 f40196b;

    public z91(ab1 ab1Var, int i10) {
        this.f40195a = i10;
        this.f40196b = ab1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        ab1 ab1Var;
        ah.i iVar2;
        ab1 ab1Var2;
        ah.i iVar3;
        switch (this.f40195a) {
            case 0:
                ab1 ab1Var3 = this.f40196b;
                if (ab1Var3.f31808r0.size() != ab1Var3.f31810s0.size() && !ab1Var3.f31815w0 && ab1Var3.U.N0() > ab1Var3.X.f33606c0 - 20) {
                    ab1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = ab1Var3.C0) != null) {
                    iVar.f(i10, i11);
                    ab1.W(ab1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = (ab1Var = this.f40196b).C0) != null) {
                    iVar2.f(i10, i11);
                    ab1.W(ab1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = (ab1Var2 = this.f40196b).C0) != null) {
                    iVar3.f(i10, i11);
                    ab1.W(ab1Var2);
                    return;
                }
                return;
        }
    }
}
