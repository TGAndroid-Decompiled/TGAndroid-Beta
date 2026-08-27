package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class w8 extends f2.b1 {

    public boolean f43641a;

    public final j9 f43642b;

    public w8(j9 j9Var) {
        this.f43642b = j9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        j9 j9Var = this.f43642b;
        ArrayList arrayList = j9Var.C;
        int iL0 = j9Var.f39294c.L0();
        int iAbs = iL0 == -1 ? 0 : Math.abs(j9Var.f39294c.N0() - iL0) + 1;
        if (iAbs > 0) {
            int size = j9Var.d.U2.f26945x.size();
            if (!j9Var.F && !j9Var.D && !arrayList.isEmpty() && iAbs + iL0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(17, this, (f9) i0.a.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.f43641a) {
            j9Var.f39296f.e(i11 < 0, true);
        }
        this.f43641a = true;
        j9Var.f39298r.b(iL0 != 0 || top < j9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = j9Var.U) == null) {
            return;
        }
        eVar.f(i10, i11);
        j9Var.f0();
    }
}
