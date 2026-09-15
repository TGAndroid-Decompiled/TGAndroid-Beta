package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class x91 extends s4.s0 {
    public final int f39558a;
    public final ya1 f39559b;

    public x91(ya1 ya1Var, int i10) {
        this.f39558a = i10;
        this.f39559b = ya1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ya1 ya1Var;
        ah.h hVar2;
        ya1 ya1Var2;
        ah.h hVar3;
        switch (this.f39558a) {
            case 0:
                ya1 ya1Var3 = this.f39559b;
                if (ya1Var3.f39817r0.size() != ya1Var3.f39819s0.size() && !ya1Var3.f39824w0 && ya1Var3.U.N0() > ya1Var3.X.f32978c0 - 20) {
                    ya1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = ya1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    ya1.W(ya1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (ya1Var = this.f39559b).C0) != null) {
                    hVar2.f(i10, i11);
                    ya1.W(ya1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (ya1Var2 = this.f39559b).C0) != null) {
                    hVar3.f(i10, i11);
                    ya1.W(ya1Var2);
                    return;
                }
                return;
        }
    }
}
