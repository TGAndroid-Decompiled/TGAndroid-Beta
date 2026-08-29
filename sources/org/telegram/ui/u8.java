package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends f2.a1 {
    public boolean f43194a;
    public final h9 f43195b;

    public u8(h9 h9Var) {
        this.f43195b = h9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        lg.e eVar;
        boolean z10;
        h9 h9Var = this.f43195b;
        ArrayList arrayList = h9Var.C;
        int L0 = h9Var.f38791c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(h9Var.f38791c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = h9Var.d.U2.f29942x.size();
            if (!h9Var.F && !h9Var.D && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(14, this, (d9) j7.l1.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f43194a) {
            org.telegram.ui.Components.u10 u10Var = h9Var.f38793f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10Var.e(z10, true);
        }
        this.f43194a = true;
        h9Var.f38795r.b((L0 != 0 || i12 < h9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = h9Var.U) != null) {
            eVar.f(i10, i11);
            h9Var.f0();
        }
    }
}
