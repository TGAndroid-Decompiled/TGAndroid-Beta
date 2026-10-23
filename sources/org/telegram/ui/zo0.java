package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class zo0 extends s4.r0 {
    public final int f44184a;
    public final fp0 f44185b;

    public zo0(fp0 fp0Var, int i10) {
        this.f44185b = fp0Var;
        this.f44184a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ai.y9 y9Var;
        bh.f fVar;
        fp0 fp0Var = this.f44185b;
        lp0 lp0Var = fp0Var.f37402p0;
        if (i11 != 0) {
            lp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = lp0Var.f39299f0) != null) {
            fVar.f(i10, i11);
        }
        fp0Var.h();
        if (fp0Var.K != null) {
            if (fp0Var.J != null && fp0Var.c()) {
                fp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f44184a == 1) {
            y9Var = lp0Var.f39294c;
        } else {
            y9Var = lp0Var.f39292b;
        }
        if (y9Var != null && fp0Var.c()) {
            y9Var.a();
        }
    }
}
