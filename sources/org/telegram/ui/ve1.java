package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ve1 extends if1 {
    public final kf1 f39156f3;

    public ve1(kf1 kf1Var, Context context) {
        super(kf1Var, context);
        this.f39156f3 = kf1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f39156f3.f35671b;
        if (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((bf1) arrayList.get(0)).f32951c == null || ((bf1) arrayList.get(0)).f32951c.f19236id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f39156f3.y0();
    }
}
