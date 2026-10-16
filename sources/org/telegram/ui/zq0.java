package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class zq0 extends g.o {
    public final fr0 f42411c;

    public zq0(fr0 fr0Var) {
        this.f42411c = fr0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        fr0 fr0Var = this.f42411c;
        if (fr0Var.L.j(i10) != 1 && !fr0Var.Y && (fr0Var.J != null || !TextUtils.isEmpty(fr0Var.v))) {
            int i12 = fr0Var.R;
            int i13 = fr0Var.f35921g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return fr0Var.M.J;
    }
}
