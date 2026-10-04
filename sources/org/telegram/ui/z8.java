package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends s4.s0 {
    public boolean f43716a;
    public final m9 f43717b;

    public z8(m9 m9Var) {
        this.f43717b = m9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        m9 m9Var = this.f43717b;
        ArrayList arrayList = m9Var.F;
        int L0 = m9Var.f38466b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(m9Var.f38466b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = m9Var.f38467c.f25244f3.f31309x.size();
            if (!m9Var.I && !m9Var.G && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(9, this, (i9) hg.k0.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.f43716a) {
            org.telegram.ui.Components.c20 c20Var = m9Var.f38469f;
            if (i11 < 0) {
                z10 = true;
            }
            c20Var.e(z10, true);
        }
        this.f43716a = true;
    }
}
