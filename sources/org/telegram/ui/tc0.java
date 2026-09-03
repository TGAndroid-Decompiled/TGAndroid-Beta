package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class tc0 extends f2.z0 {
    public final cd0 f38461a;

    public tc0(cd0 cd0Var) {
        this.f38461a = cd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        cd0 cd0Var = this.f38461a;
        cd0Var.N = z4;
        if (!z4 && cd0Var.I != null) {
            cd0Var.I = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cd0 cd0Var = this.f38461a;
        cd0Var.A0(false);
        if (cd0Var.I != null) {
            cd0Var.K += i11;
        }
    }
}
