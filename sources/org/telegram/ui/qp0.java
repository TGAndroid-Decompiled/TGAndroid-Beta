package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class qp0 extends s4.s0 {
    public final int f37011a;
    public final wp0 f37012b;

    public qp0(wp0 wp0Var, int i10) {
        this.f37012b = wp0Var;
        this.f37011a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.n5 n5Var;
        ah.i iVar;
        wp0 wp0Var = this.f37012b;
        cq0 cq0Var = wp0Var.f39152p0;
        if (i11 != 0) {
            cq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = cq0Var.f32860f0) != null) {
            iVar.f(i10, i11);
        }
        wp0Var.h();
        if (wp0Var.K != null) {
            if (wp0Var.J != null && wp0Var.c()) {
                wp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f37011a == 1) {
            n5Var = cq0Var.f32855c;
        } else {
            n5Var = cq0Var.f32853b;
        }
        if (n5Var != null && wp0Var.c()) {
            n5Var.a();
        }
    }
}
