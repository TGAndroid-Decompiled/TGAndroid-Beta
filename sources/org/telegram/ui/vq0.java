package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class vq0 extends g.p {
    public final br0 f37608c;

    public vq0(br0 br0Var) {
        this.f37608c = br0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        br0 br0Var = this.f37608c;
        if (br0Var.L.j(i10) != 1 && !br0Var.Y && (br0Var.J != null || !TextUtils.isEmpty(br0Var.v))) {
            int i12 = br0Var.R;
            int i13 = br0Var.f31373g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return br0Var.M.J;
    }
}
