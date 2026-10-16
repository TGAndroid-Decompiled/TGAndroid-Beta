package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class sp0 extends s4.r0 {
    public final int f39921a;
    public final yp0 f39922b;

    public sp0(yp0 yp0Var, int i10) {
        this.f39922b = yp0Var;
        this.f39921a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zh.f5 f5Var;
        bh.f fVar;
        yp0 yp0Var = this.f39922b;
        eq0 eq0Var = yp0Var.f41880p0;
        if (i11 != 0) {
            eq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = eq0Var.f35356f0) != null) {
            fVar.f(i10, i11);
        }
        yp0Var.h();
        if (yp0Var.K != null) {
            if (yp0Var.J != null && yp0Var.c()) {
                yp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f39921a == 1) {
            f5Var = eq0Var.f35351c;
        } else {
            f5Var = eq0Var.f35349b;
        }
        if (f5Var != null && yp0Var.c()) {
            f5Var.a();
        }
    }
}
