package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class uq0 extends g.o {
    public final ar0 f42790c;

    public uq0(ar0 ar0Var) {
        this.f42790c = ar0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        ar0 ar0Var = this.f42790c;
        if (ar0Var.L.j(i10) != 1 && !ar0Var.Y && (ar0Var.J != null || !TextUtils.isEmpty(ar0Var.v))) {
            int i12 = ar0Var.R;
            int i13 = ar0Var.f36178g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return ar0Var.M.J;
    }
}
