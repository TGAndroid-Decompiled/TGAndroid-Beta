package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class v8 extends u4.t0 {
    public boolean f50422a;
    public final h9 f50423b;

    public v8(h9 h9Var) {
        this.f50423b = h9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int abs;
        h9 h9Var = this.f50423b;
        ArrayList arrayList = h9Var.f45865y;
        int L0 = h9Var.f45856b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(h9Var.f45856b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = h9Var.f45857c.f35594g3.E.size();
            if (!h9Var.G && !h9Var.E && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(19, this, (e9) k2.p1.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f50422a) {
            org.telegram.ui.Components.l00 l00Var = h9Var.f45859f;
            if (i10 < 0) {
                z10 = true;
            }
            l00Var.e(z10, true);
        }
        this.f50422a = true;
    }
}
