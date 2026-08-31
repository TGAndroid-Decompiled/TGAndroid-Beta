package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class xe1 extends kf1 {
    public final mf1 f43042f3;

    public xe1(mf1 mf1Var, Context context) {
        super(mf1Var, context);
        this.f43042f3 = mf1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f43042f3.f39105b;
        if (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((df1) arrayList.get(0)).f36216c == null || ((df1) arrayList.get(0)).f36216c.f20895id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f43042f3.y0();
    }
}
