package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class up0 extends f2.v {
    public final zp0 f43306c;

    public up0(zp0 zp0Var) {
        this.f43306c = zp0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        zp0 zp0Var = this.f43306c;
        if (zp0Var.H.j(i10) != 1 && !zp0Var.U && (zp0Var.F != null || !TextUtils.isEmpty(zp0Var.v))) {
            int i12 = zp0Var.N;
            int i13 = zp0Var.f45276c0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return zp0Var.I.J;
    }
}
