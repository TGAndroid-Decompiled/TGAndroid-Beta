package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class w8 extends v4.t0 {
    public boolean f52493a;
    public final i9 f52494b;

    public w8(i9 i9Var) {
        this.f52494b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        i9 i9Var = this.f52494b;
        ArrayList arrayList = i9Var.f47975y;
        int L0 = i9Var.f47966b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f47966b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.f47967c.f39892g3.E.size();
            if (!i9Var.G && !i9Var.E && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new u5(3, this, (f9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f52493a) {
            org.telegram.ui.Components.t00 t00Var = i9Var.f47969f;
            if (i10 < 0) {
                z10 = true;
            }
            t00Var.e(z10, true);
        }
        this.f52493a = true;
    }
}
