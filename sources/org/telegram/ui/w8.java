package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class w8 extends v4.t0 {
    public boolean f52979a;
    public final i9 f52980b;

    public w8(i9 i9Var) {
        this.f52980b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        i9 i9Var = this.f52980b;
        ArrayList arrayList = i9Var.f48674x;
        int L0 = i9Var.f48666b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f48666b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.f48667c.f35742g3.E.size();
            if (!i9Var.F && !i9Var.f48675y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new oi.s2(29, this, (f9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f52979a) {
            org.telegram.ui.Components.c10 c10Var = i9Var.f48669f;
            if (i10 < 0) {
                z10 = true;
            }
            c10Var.e(z10, true);
        }
        this.f52979a = true;
    }
}
