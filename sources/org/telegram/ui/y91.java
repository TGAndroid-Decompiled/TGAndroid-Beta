package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class y91 extends s4.s0 {
    public final int f39790a;
    public final za1 f39791b;

    public y91(za1 za1Var, int i10) {
        this.f39790a = i10;
        this.f39791b = za1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        za1 za1Var;
        ah.h hVar2;
        za1 za1Var2;
        ah.h hVar3;
        switch (this.f39790a) {
            case 0:
                za1 za1Var3 = this.f39791b;
                if (za1Var3.f40130r0.size() != za1Var3.f40132s0.size() && !za1Var3.f40137w0 && za1Var3.U.N0() > za1Var3.X.f33249c0 - 20) {
                    za1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = za1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    za1.W(za1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (za1Var = this.f39791b).C0) != null) {
                    hVar2.f(i10, i11);
                    za1.W(za1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (za1Var2 = this.f39791b).C0) != null) {
                    hVar3.f(i10, i11);
                    za1.W(za1Var2);
                    return;
                }
                return;
        }
    }
}
