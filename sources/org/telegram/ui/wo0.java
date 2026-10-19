package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class wo0 extends s4.r0 {
    public final int f42929a;
    public final cp0 f42930b;

    public wo0(cp0 cp0Var, int i10) {
        this.f42930b = cp0Var;
        this.f42929a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ai.y9 y9Var;
        bh.f fVar;
        cp0 cp0Var = this.f42930b;
        ip0 ip0Var = cp0Var.f36031p0;
        if (i11 != 0) {
            ip0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = ip0Var.f38082f0) != null) {
            fVar.f(i10, i11);
        }
        cp0Var.h();
        if (cp0Var.K != null) {
            if (cp0Var.J != null && cp0Var.c()) {
                cp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f42929a == 1) {
            y9Var = ip0Var.f38077c;
        } else {
            y9Var = ip0Var.f38075b;
        }
        if (y9Var != null && cp0Var.c()) {
            y9Var.a();
        }
    }
}
