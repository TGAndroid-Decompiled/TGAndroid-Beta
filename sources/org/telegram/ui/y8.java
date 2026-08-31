package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y8 extends f2.a1 {
    public boolean f43574a;
    public final l9 f43575b;

    public y8(l9 l9Var) {
        this.f43575b = l9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        og.e eVar;
        boolean z4;
        l9 l9Var = this.f43575b;
        ArrayList arrayList = l9Var.D;
        int L0 = l9Var.f38672c.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(l9Var.f38672c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = l9Var.d.V2.f32960x.size();
            if (!l9Var.G && !l9Var.E && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(22, this, (h9) l.d.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f43574a) {
            org.telegram.ui.Components.a20 a20Var = l9Var.f38675f;
            if (i11 < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            a20Var.e(z4, true);
        }
        this.f43574a = true;
        l9Var.f38677r.b((L0 != 0 || i12 < l9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = l9Var.V) != null) {
            eVar.f(i10, i11);
            l9Var.f0();
        }
    }
}
