package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends g.o {
    public final dr0 f44154c;

    public xq0(dr0 dr0Var) {
        this.f44154c = dr0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        dr0 dr0Var = this.f44154c;
        if (dr0Var.L.j(i10) != 1 && !dr0Var.Y && (dr0Var.J != null || !TextUtils.isEmpty(dr0Var.v))) {
            int i12 = dr0Var.R;
            int i13 = dr0Var.f36880g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return dr0Var.M.J;
    }
}
