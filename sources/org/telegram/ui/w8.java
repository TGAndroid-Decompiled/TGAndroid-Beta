package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class w8 extends v4.s0 {
    public boolean f51018a;
    public final i9 f51019b;

    public w8(i9 i9Var) {
        this.f51019b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        i9 i9Var = this.f51019b;
        ArrayList arrayList = i9Var.f46612y;
        int L0 = i9Var.f46603b.L0();
        boolean z9 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f46603b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.f46604c.f36781f3.D.size();
            if (!i9Var.F && !i9Var.D && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(14, this, (f9) jg.g.i(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f51018a) {
            org.telegram.ui.Components.p00 p00Var = i9Var.f46606f;
            if (i10 < 0) {
                z9 = true;
            }
            p00Var.e(z9, true);
        }
        this.f51018a = true;
    }
}
