package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class x8 extends v4.u0 {
    public boolean f53786a;
    public final j9 f53787b;

    public x8(j9 j9Var) {
        this.f53787b = j9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        j9 j9Var = this.f53787b;
        ArrayList arrayList = j9Var.f48942x;
        int L0 = j9Var.f48934b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(j9Var.f48934b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = j9Var.f48935c.f35789g3.E.size();
            if (!j9Var.F && !j9Var.f48943y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new u8(1, this, (g9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f53786a) {
            org.telegram.ui.Components.c10 c10Var = j9Var.f48937f;
            if (i10 < 0) {
                z10 = true;
            }
            c10Var.e(z10, true);
        }
        this.f53786a = true;
    }
}
