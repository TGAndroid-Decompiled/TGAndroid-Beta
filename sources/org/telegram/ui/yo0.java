package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class yo0 extends f2.a1 {
    public final int f43672a;
    public final dp0 f43673b;

    public yo0(dp0 dp0Var, int i10) {
        this.f43673b = dp0Var;
        this.f43672a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mh.l7 l7Var;
        dp0 dp0Var = this.f43673b;
        ip0 ip0Var = dp0Var.f36282g0;
        if (dp0Var.C != null) {
            if (dp0Var.B != null && dp0Var.c()) {
                dp0Var.B.g(false);
                return;
            }
            return;
        }
        if (this.f43672a == 1) {
            l7Var = ip0Var.f37906c;
        } else {
            l7Var = ip0Var.f37905b;
        }
        if (l7Var != null && dp0Var.c()) {
            l7Var.a();
        }
    }
}
