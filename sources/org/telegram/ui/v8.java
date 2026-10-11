package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends s4.t0 {
    public boolean f42899a;
    public final i9 f42900b;

    public v8(i9 i9Var) {
        this.f42900b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.h hVar;
        boolean z10;
        i9 i9Var = this.f42900b;
        ArrayList arrayList = i9Var.G;
        int L0 = i9Var.f38616c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f38616c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.d.W2.f25893x.size();
            if (!i9Var.J && !i9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(11, this, (e9) hg.c.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f42899a) {
            org.telegram.ui.Components.q20 q20Var = i9Var.f38621f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q20Var.e(z10, true);
        }
        this.f42899a = true;
        ci.r6 r6Var = i9Var.f38624r;
        if (L0 != 0 || i12 < i9Var.d.getPaddingTop()) {
            z11 = true;
        }
        r6Var.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = i9Var.Y) != null) {
            hVar.f(i10, i11);
            i9Var.f0();
        }
    }
}
