package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class z91 extends s4.t0 {
    public final int f44621a;
    public final ab1 f44622b;

    public z91(ab1 ab1Var, int i10) {
        this.f44621a = i10;
        this.f44622b = ab1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ab1 ab1Var;
        ah.h hVar2;
        ab1 ab1Var2;
        ah.h hVar3;
        switch (this.f44621a) {
            case 0:
                ab1 ab1Var3 = this.f44622b;
                if (ab1Var3.f35984r0.size() != ab1Var3.f35986s0.size() && !ab1Var3.f35991w0 && ab1Var3.U.N0() > ab1Var3.X.f37619c0 - 20) {
                    ab1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = ab1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    ab1.W(ab1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (ab1Var = this.f44622b).C0) != null) {
                    hVar2.f(i10, i11);
                    ab1.W(ab1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (ab1Var2 = this.f44622b).C0) != null) {
                    hVar3.f(i10, i11);
                    ab1.W(ab1Var2);
                    return;
                }
                return;
        }
    }
}
