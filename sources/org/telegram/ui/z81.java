package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class z81 extends k91 {
    public final m91 f52585p3;

    public z81(m91 m91Var, Context context) {
        super(m91Var, context);
        this.f52585p3 = m91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f52585p3.f47578b;
        if (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((e91) arrayList.get(0)).f44941c == null || ((e91) arrayList.get(0)).f44941c.f27053id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f52585p3.C0();
    }
}
