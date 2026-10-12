package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class wf1 extends jg1 {
    public final lg1 f41588g3;

    public wf1(lg1 lg1Var, Context context) {
        super(lg1Var, context);
        this.f41588g3 = lg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f41588g3.f37960b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((cg1) arrayList.get(0)).f34947c == null || ((cg1) arrayList.get(0)).f34947c.f19268id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41588g3.y0();
    }
}
