package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class up0 extends f2.x {
    public final zp0 f43294c;

    public up0(zp0 zp0Var) {
        this.f43294c = zp0Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        zp0 zp0Var = this.f43294c;
        if (zp0Var.H.j(i9) != 1 && !zp0Var.U && (zp0Var.F != null || !TextUtils.isEmpty(zp0Var.v))) {
            int i11 = zp0Var.N;
            int i12 = zp0Var.f45211c0;
            if (i9 % i12 != i12 - 1) {
                i10 = AndroidUtilities.dp(2.0f);
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }
        return zp0Var.I.J;
    }
}
