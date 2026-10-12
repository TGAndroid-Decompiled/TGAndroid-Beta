package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class qp0 extends s4.t0 {
    public final int f41385a;
    public final wp0 f41386b;

    public qp0(wp0 wp0Var, int i10) {
        this.f41386b = wp0Var;
        this.f41385a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.f5 f5Var;
        ah.h hVar;
        wp0 wp0Var = this.f41386b;
        cq0 cq0Var = wp0Var.f43602p0;
        if (i11 != 0) {
            cq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = cq0Var.f36486f0) != null) {
            hVar.f(i10, i11);
        }
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J != null && wp0Var.c()) {
                wp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f41385a == 1) {
            f5Var = cq0Var.f36480c;
        } else {
            f5Var = cq0Var.f36478b;
        }
        if (f5Var != null && wp0Var.c()) {
            f5Var.a();
        }
    }
}
