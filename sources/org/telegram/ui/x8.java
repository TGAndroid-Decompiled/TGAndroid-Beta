package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x8 extends s4.s0 {
    public boolean f39857a;
    public final k9 f39858b;

    public x8(k9 k9Var) {
        this.f39858b = k9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.h hVar;
        boolean z10;
        k9 k9Var = this.f39858b;
        ArrayList arrayList = k9Var.G;
        int L0 = k9Var.f34983c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(k9Var.f34983c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = k9Var.d.Y2.f25647x.size();
            if (!k9Var.J && !k9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(10, this, (g9) hg.c.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f39857a) {
            org.telegram.ui.Components.a20 a20Var = k9Var.f34987f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a20Var.e(z10, true);
        }
        this.f39857a = true;
        k9Var.f34990r.b((L0 != 0 || i12 < k9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = k9Var.Y) != null) {
            hVar.f(i10, i11);
            k9Var.f0();
        }
    }
}
