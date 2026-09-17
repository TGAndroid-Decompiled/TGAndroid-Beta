package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends s4.s0 {
    public boolean f40148a;
    public final m9 f40149b;

    public z8(m9 m9Var) {
        this.f40149b = m9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.i iVar;
        boolean z10;
        m9 m9Var = this.f40149b;
        ArrayList arrayList = m9Var.G;
        int L0 = m9Var.f35711c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(m9Var.f35711c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = m9Var.d.Y2.f29854x.size();
            if (!m9Var.J && !m9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new l4(5, this, (i9) hg.k0.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f40148a) {
            org.telegram.ui.Components.y10 y10Var = m9Var.f35715f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            y10Var.e(z10, true);
        }
        this.f40148a = true;
        m9Var.f35718r.b((L0 != 0 || i12 < m9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = m9Var.Y) != null) {
            iVar.f(i10, i11);
            m9Var.f0();
        }
    }
}
