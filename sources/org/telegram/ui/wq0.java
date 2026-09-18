package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class wq0 extends g.p {
    public final cr0 f39230c;

    public wq0(cr0 cr0Var) {
        this.f39230c = cr0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        cr0 cr0Var = this.f39230c;
        if (cr0Var.L.j(i10) != 1 && !cr0Var.Y && (cr0Var.J != null || !TextUtils.isEmpty(cr0Var.v))) {
            int i12 = cr0Var.R;
            int i13 = cr0Var.f32770g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return cr0Var.M.J;
    }
}
