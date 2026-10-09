package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class w8 extends s4.t0 {
    public boolean f43108a;
    public final j9 f43109b;

    public w8(j9 j9Var) {
        this.f43109b = j9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ah.h hVar;
        boolean z10;
        j9 j9Var = this.f43109b;
        ArrayList arrayList = j9Var.G;
        int L0 = j9Var.f38868c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(j9Var.f38868c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = j9Var.d.W2.f25283x.size();
            if (!j9Var.J && !j9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(12, this, (f9) hg.c.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f43108a) {
            org.telegram.ui.Components.p20 p20Var = j9Var.f38873f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p20Var.e(z10, true);
        }
        this.f43108a = true;
        ci.r6 r6Var = j9Var.f38876r;
        if (L0 != 0 || i12 < j9Var.d.getPaddingTop()) {
            z11 = true;
        }
        r6Var.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (hVar = j9Var.Y) != null) {
            hVar.f(i10, i11);
            j9Var.f0();
        }
    }
}
