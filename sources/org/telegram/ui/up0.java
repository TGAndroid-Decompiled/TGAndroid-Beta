package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class up0 extends s4.r0 {
    public final int f40783a;
    public final aq0 f40784b;

    public up0(aq0 aq0Var, int i10) {
        this.f40784b = aq0Var;
        this.f40783a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zh.f5 f5Var;
        bh.f fVar;
        aq0 aq0Var = this.f40784b;
        gq0 gq0Var = aq0Var.f34322p0;
        if (i11 != 0) {
            gq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = gq0Var.f36457f0) != null) {
            fVar.f(i10, i11);
        }
        aq0Var.h();
        if (aq0Var.K != null) {
            if (aq0Var.J != null && aq0Var.c()) {
                aq0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f40783a == 1) {
            f5Var = gq0Var.f36452c;
        } else {
            f5Var = gq0Var.f36450b;
        }
        if (f5Var != null && aq0Var.c()) {
            f5Var.a();
        }
    }
}
