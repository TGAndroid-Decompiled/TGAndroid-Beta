package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class r81 extends f2.d1 {
    public final int f42329a;
    public final s91 f42330b;

    public r81(s91 s91Var, int i9) {
        this.f42329a = i9;
        this.f42330b = s91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        s91 s91Var;
        ig.e eVar2;
        s91 s91Var2;
        ig.e eVar3;
        switch (this.f42329a) {
            case 0:
                s91 s91Var3 = this.f42330b;
                if (s91Var3.f42624n0.size() != s91Var3.f42625o0.size() && !s91Var3.f42631s0 && s91Var3.Q.N0() > s91Var3.T.Y - 20) {
                    s91Var3.g0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = s91Var3.f42640y0) != null) {
                    eVar.f(i9, i10);
                    s91.V(s91Var3);
                    return;
                }
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (s91Var = this.f42330b).f42640y0) != null) {
                    eVar2.f(i9, i10);
                    s91.V(s91Var);
                    return;
                }
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (s91Var2 = this.f42330b).f42640y0) != null) {
                    eVar3.f(i9, i10);
                    s91.V(s91Var2);
                    return;
                }
                return;
        }
    }
}
