package org.telegram.ui.web;

import android.os.Bundle;
import bi.n9;
import org.json.JSONObject;
import org.telegram.ui.yy;
public final class g0 extends yy {
    public final boolean[] B4;
    public final n9 C4;
    public final c1 D4;

    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, n9 n9Var) {
        super(bundle);
        this.D4 = c1Var;
        this.B4 = zArr;
        this.C4 = n9Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.B4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.D4.x(this.C4, "requested_chat_failed", jSONObject);
        }
    }
}
