package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class s81 extends s4.r0 {
    public final int f41318a;
    public final t91 f41319b;

    public s81(t91 t91Var, int i10) {
        this.f41318a = i10;
        this.f41319b = t91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        t91 t91Var;
        bh.f fVar2;
        t91 t91Var2;
        bh.f fVar3;
        switch (this.f41318a) {
            case 0:
                t91 t91Var3 = this.f41319b;
                if (t91Var3.f41963r0.size() != t91Var3.f41965s0.size() && !t91Var3.f41970w0 && t91Var3.U.N0() > t91Var3.X.f43794c0 - 20) {
                    t91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = t91Var3.E0) != null) {
                    fVar.f(i10, i11);
                    t91.W(t91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (t91Var = this.f41319b).E0) != null) {
                    fVar2.f(i10, i11);
                    t91.W(t91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (t91Var2 = this.f41319b).E0) != null) {
                    fVar3.f(i10, i11);
                    t91.W(t91Var2);
                    return;
                }
                return;
        }
    }
}
