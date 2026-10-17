package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class xo0 extends s4.r0 {
    public final int f43227a;
    public final dp0 f43228b;

    public xo0(dp0 dp0Var, int i10) {
        this.f43228b = dp0Var;
        this.f43227a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ai.x9 x9Var;
        bh.f fVar;
        dp0 dp0Var = this.f43228b;
        jp0 jp0Var = dp0Var.f36261p0;
        if (i11 != 0) {
            jp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = jp0Var.f38248f0) != null) {
            fVar.f(i10, i11);
        }
        dp0Var.h();
        if (dp0Var.K != null) {
            if (dp0Var.J != null && dp0Var.c()) {
                dp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f43227a == 1) {
            x9Var = jp0Var.f38243c;
        } else {
            x9Var = jp0Var.f38241b;
        }
        if (x9Var != null && dp0Var.c()) {
            x9Var.a();
        }
    }
}
