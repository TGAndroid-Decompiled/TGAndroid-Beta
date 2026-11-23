package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class x8 extends v4.u0 {
    public boolean f53880a;
    public final j9 f53881b;

    public x8(j9 j9Var) {
        this.f53881b = j9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        j9 j9Var = this.f53881b;
        ArrayList arrayList = j9Var.f49057x;
        int L0 = j9Var.f49049b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(j9Var.f49049b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = j9Var.f49050c.f35323g3.E.size();
            if (!j9Var.F && !j9Var.f49058y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new u5(3, this, (g9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.f53880a) {
            org.telegram.ui.Components.a10 a10Var = j9Var.f49052f;
            if (i10 < 0) {
                z10 = true;
            }
            a10Var.e(z10, true);
        }
        this.f53880a = true;
    }
}
