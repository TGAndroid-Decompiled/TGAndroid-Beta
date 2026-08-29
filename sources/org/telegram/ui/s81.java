package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class s81 extends f2.a1 {
    public final int f42319a;
    public final t91 f42320b;

    public s81(t91 t91Var, int i10) {
        this.f42319a = i10;
        this.f42320b = t91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        t91 t91Var;
        lg.e eVar2;
        t91 t91Var2;
        lg.e eVar3;
        switch (this.f42319a) {
            case 0:
                t91 t91Var3 = this.f42320b;
                if (t91Var3.f42606n0.size() != t91Var3.f42607o0.size() && !t91Var3.f42613s0 && t91Var3.Q.N0() > t91Var3.T.Y - 20) {
                    t91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = t91Var3.f42622y0) != null) {
                    eVar.f(i10, i11);
                    t91.W(t91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (t91Var = this.f42320b).f42622y0) != null) {
                    eVar2.f(i10, i11);
                    t91.W(t91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (t91Var2 = this.f42320b).f42622y0) != null) {
                    eVar3.f(i10, i11);
                    t91.W(t91Var2);
                    return;
                }
                return;
        }
    }
}
