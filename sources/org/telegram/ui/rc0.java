package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class rc0 extends f2.z0 {
    public final ad0 f37981a;

    public rc0(ad0 ad0Var) {
        this.f37981a = ad0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ad0 ad0Var = this.f37981a;
        ad0Var.N = z4;
        if (!z4 && ad0Var.I != null) {
            ad0Var.I = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ad0 ad0Var = this.f37981a;
        ad0Var.A0(false);
        if (ad0Var.I != null) {
            ad0Var.K += i11;
        }
    }
}
