package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class w8 extends v4.s0 {
    public boolean f50972a;
    public final i9 f50973b;

    public w8(i9 i9Var) {
        this.f50973b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        i9 i9Var = this.f50973b;
        ArrayList arrayList = i9Var.f46532y;
        int L0 = i9Var.f46523b.L0();
        boolean z9 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f46523b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.f46524c.f37556f3.D.size();
            if (!i9Var.F && !i9Var.D && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(14, this, (f9) jg.g.i(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f50972a) {
            org.telegram.ui.Components.q00 q00Var = i9Var.f46526f;
            if (i10 < 0) {
                z9 = true;
            }
            q00Var.e(z9, true);
        }
        this.f50972a = true;
    }
}
