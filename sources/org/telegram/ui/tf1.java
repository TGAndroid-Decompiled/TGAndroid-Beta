package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class tf1 extends gg1 {
    public final ig1 f36928i3;

    public tf1(ig1 ig1Var, Context context) {
        super(ig1Var, context);
        this.f36928i3 = ig1Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f36928i3.f33684b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((zf1) arrayList.get(0)).f39309c == null || ((zf1) arrayList.get(0)).f39309c.f17247id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36928i3.y0();
    }
}
