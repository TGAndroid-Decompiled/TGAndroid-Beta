package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends s4.r0 {
    public boolean f44073a;
    public final m9 f44074b;

    public z8(m9 m9Var) {
        this.f44074b = m9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        bh.f fVar;
        boolean z10;
        m9 m9Var = this.f44074b;
        ArrayList arrayList = m9Var.G;
        int L0 = m9Var.f39412c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(m9Var.f39412c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = m9Var.d.Z2.f24976y.size();
            if (!m9Var.J && !m9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new h0(7, this, (i9) i2.o1.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f44073a) {
            org.telegram.ui.Components.h20 h20Var = m9Var.f39416f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h20Var.e(z10, true);
        }
        this.f44073a = true;
        ei.g6 g6Var = m9Var.f39420r;
        if (L0 != 0 || i12 < m9Var.d.getPaddingTop()) {
            z11 = true;
        }
        g6Var.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = m9Var.Y) != null) {
            fVar.f(i10, i11);
            m9Var.e0();
        }
    }
}
