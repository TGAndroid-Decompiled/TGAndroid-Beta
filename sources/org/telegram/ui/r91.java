package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class r91 extends s4.s0 {
    public final int f37259a;
    public final sa1 f37260b;

    public r91(sa1 sa1Var, int i10) {
        this.f37259a = i10;
        this.f37260b = sa1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        sa1 sa1Var;
        ah.h hVar2;
        sa1 sa1Var2;
        ah.h hVar3;
        switch (this.f37259a) {
            case 0:
                sa1 sa1Var3 = this.f37260b;
                if (sa1Var3.f37674r0.size() != sa1Var3.f37676s0.size() && !sa1Var3.f37681w0 && sa1Var3.U.N0() > sa1Var3.X.f39868c0 - 20) {
                    sa1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = sa1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    sa1.W(sa1Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (sa1Var = this.f37260b).C0) != null) {
                    hVar2.f(i10, i11);
                    sa1.W(sa1Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (sa1Var2 = this.f37260b).C0) != null) {
                    hVar3.f(i10, i11);
                    sa1.W(sa1Var2);
                    return;
                }
                return;
        }
    }
}
