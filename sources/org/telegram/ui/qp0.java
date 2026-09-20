package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class qp0 extends s4.s0 {
    public final int f36955a;
    public final wp0 f36956b;

    public qp0(wp0 wp0Var, int i10) {
        this.f36956b = wp0Var;
        this.f36955a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.l5 l5Var;
        ah.i iVar;
        wp0 wp0Var = this.f36956b;
        cq0 cq0Var = wp0Var.f39211p0;
        if (i11 != 0) {
            cq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = cq0Var.f32817f0) != null) {
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
        if (this.f36955a == 1) {
            l5Var = cq0Var.f32812c;
        } else {
            l5Var = cq0Var.f32810b;
        }
        if (l5Var != null && wp0Var.c()) {
            l5Var.a();
        }
    }
}
