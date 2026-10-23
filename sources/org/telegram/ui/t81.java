package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class t81 extends s4.r0 {
    public final int f41923a;
    public final u91 f41924b;

    public t81(u91 u91Var, int i10) {
        this.f41923a = i10;
        this.f41924b = u91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        u91 u91Var;
        bh.f fVar2;
        u91 u91Var2;
        bh.f fVar3;
        switch (this.f41923a) {
            case 0:
                u91 u91Var3 = this.f41924b;
                if (u91Var3.f42332r0.size() != u91Var3.f42334s0.size() && !u91Var3.f42339w0 && u91Var3.U.N0() > u91Var3.X.f44080c0 - 20) {
                    u91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = u91Var3.E0) != null) {
                    fVar.f(i10, i11);
                    u91.W(u91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (u91Var = this.f41924b).E0) != null) {
                    fVar2.f(i10, i11);
                    u91.W(u91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (u91Var2 = this.f41924b).E0) != null) {
                    fVar3.f(i10, i11);
                    u91.W(u91Var2);
                    return;
                }
                return;
        }
    }
}
