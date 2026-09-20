package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y8 extends s4.s0 {
    public boolean f39824a;
    public final l9 f39825b;

    public y8(l9 l9Var) {
        this.f39825b = l9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.i iVar;
        boolean z10;
        l9 l9Var = this.f39825b;
        ArrayList arrayList = l9Var.G;
        int L0 = l9Var.f35362c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(l9Var.f35362c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = l9Var.d.Y2.f25681x.size();
            if (!l9Var.J && !l9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(11, this, (h9) hg.k0.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f39824a) {
            org.telegram.ui.Components.y10 y10Var = l9Var.f35366f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            y10Var.e(z10, true);
        }
        this.f39824a = true;
        l9Var.f35369r.b((L0 != 0 || i12 < l9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (iVar = l9Var.Y) != null) {
            iVar.f(i10, i11);
            l9Var.f0();
        }
    }
}
