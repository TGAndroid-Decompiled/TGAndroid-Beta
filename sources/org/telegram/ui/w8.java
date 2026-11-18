package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class w8 extends v4.u0 {
    public boolean f53006a;
    public final i9 f53007b;

    public w8(i9 i9Var) {
        this.f53007b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        i9 i9Var = this.f53007b;
        ArrayList arrayList = i9Var.f48663x;
        int L0 = i9Var.f48655b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f48655b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.f48656c.f34607g3.E.size();
            if (!i9Var.F && !i9Var.f48664y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new oi.s2(29, this, (f9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f53006a) {
            org.telegram.ui.Components.a10 a10Var = i9Var.f48658f;
            if (i10 < 0) {
                z10 = true;
            }
            a10Var.e(z10, true);
        }
        this.f53006a = true;
    }
}
