package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends f2.d1 {
    public boolean f43402a;
    public final i9 f43403b;

    public v8(i9 i9Var) {
        this.f43403b = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int abs;
        int i11;
        ig.e eVar;
        boolean z10;
        i9 i9Var = this.f43403b;
        ArrayList arrayList = i9Var.C;
        int L0 = i9Var.f39072c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(i9Var.f39072c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = i9Var.d.U2.f35191x.size();
            if (!i9Var.F && !i9Var.D && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(17, this, (e9) j3.r0.j(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i11 = childAt.getTop();
        } else {
            i11 = 0;
        }
        if (i10 != 0 && this.f43402a) {
            org.telegram.ui.Components.j10 j10Var = i9Var.f39074f;
            if (i10 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j10Var.e(z10, true);
        }
        this.f43402a = true;
        i9Var.f39076r.b((L0 != 0 || i11 < i9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = i9Var.U) != null) {
            eVar.f(i9, i10);
            i9Var.e0();
        }
    }
}
