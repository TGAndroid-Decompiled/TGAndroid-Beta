package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class qq0 extends g.p {
    public final wq0 f39792c;

    public qq0(wq0 wq0Var) {
        this.f39792c = wq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        wq0 wq0Var = this.f39792c;
        if (wq0Var.L.j(i10) != 1 && !wq0Var.Y && (wq0Var.J != null || !TextUtils.isEmpty(wq0Var.v))) {
            int i12 = wq0Var.R;
            int i13 = wq0Var.f42604g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return wq0Var.M.J;
    }
}
