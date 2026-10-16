package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class vf1 extends ig1 {
    public final kg1 f40695g3;

    public vf1(kg1 kg1Var, Context context) {
        super(kg1Var, context);
        this.f40695g3 = kg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f40695g3.f37383b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((bg1) arrayList.get(0)).f34328c == null || ((bg1) arrayList.get(0)).f34328c.f18968id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f40695g3.y0();
    }
}
