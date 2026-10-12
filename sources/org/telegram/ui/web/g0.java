package org.telegram.ui.web;

import android.os.Bundle;
import bi.n9;
import org.json.JSONObject;
import org.telegram.ui.yy;
public final class g0 extends yy {
    public final boolean[] A4;
    public final n9 B4;
    public final b1 C4;

    public g0(b1 b1Var, Bundle bundle, boolean[] zArr, n9 n9Var) {
        super(bundle);
        this.C4 = b1Var;
        this.A4 = zArr;
        this.B4 = n9Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.A4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.C4.x(this.B4, "requested_chat_failed", jSONObject);
        }
    }
}
