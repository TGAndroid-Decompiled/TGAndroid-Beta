package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class x8 extends s4.s0 {
    public boolean f43280a;
    public final j9 f43281b;

    public x8(j9 j9Var) {
        this.f43281b = j9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        j9 j9Var = this.f43281b;
        ArrayList arrayList = j9Var.f38318y;
        int L0 = j9Var.f38310b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(j9Var.f38310b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = j9Var.f38311c.f31183f3.D.size();
            if (!j9Var.F && !j9Var.D && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.i0.g3(new h0(8, this, (g9) i0.a.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.f43280a) {
            org.telegram.ui.Components.f10 f10Var = j9Var.f38312f;
            if (i11 < 0) {
                z10 = true;
            }
            f10Var.e(z10, true);
        }
        this.f43280a = true;
    }
}
