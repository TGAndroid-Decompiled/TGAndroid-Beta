package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends s4.t0 {
    public boolean f44638a;
    public final m9 f44639b;

    public z8(m9 m9Var) {
        this.f44639b = m9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.h hVar;
        boolean z10;
        m9 m9Var = this.f44639b;
        ArrayList arrayList = m9Var.G;
        int L0 = m9Var.f39955c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(m9Var.f39955c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = m9Var.d.W2.f26682x.size();
            if (!m9Var.J && !m9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(9, this, (i9) hg.c.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f44638a) {
            org.telegram.ui.Components.s20 s20Var = m9Var.f39960f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            s20Var.e(z10, true);
        }
        this.f44638a = true;
        ci.r6 r6Var = m9Var.f39963r;
        if (L0 != 0 || i12 < m9Var.d.getPaddingTop()) {
            z11 = true;
        }
        r6Var.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = m9Var.Y) != null) {
            hVar.f(i10, i11);
            m9Var.f0();
        }
    }
}
