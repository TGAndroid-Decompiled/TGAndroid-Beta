package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

public final class vp0 extends f2.w {

    public final aq0 f43513c;

    public vp0(aq0 aq0Var) {
        this.f43513c = aq0Var;
    }

    @Override
    public final int i(int i10) {
        aq0 aq0Var = this.f43513c;
        if (aq0Var.H.j(i10) == 1 || aq0Var.U || (aq0Var.F == null && TextUtils.isEmpty(aq0Var.v))) {
            return aq0Var.I.J;
        }
        int i11 = aq0Var.N;
        int i12 = aq0Var.f36601c0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
