package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class sf1 extends fg1 {
    public final hg1 f41915g3;

    public sf1(hg1 hg1Var, Context context) {
        super(hg1Var, context);
        this.f41915g3 = hg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f41915g3.f38379b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((yf1) arrayList.get(0)).f44469c == null || ((yf1) arrayList.get(0)).f44469c.f19854id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41915g3.y0();
    }
}
