package org.telegram.ui.web;

import android.os.Bundle;
import di.p7;
import org.json.JSONObject;
import org.telegram.ui.zw;
public final class c0 extends zw {
    public final boolean[] C4;
    public final p7 D4;
    public final x0 E4;

    public c0(x0 x0Var, Bundle bundle, boolean[] zArr, p7 p7Var) {
        super(bundle);
        this.E4 = x0Var;
        this.C4 = zArr;
        this.D4 = p7Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.C4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.E4.x(this.D4, "requested_chat_failed", jSONObject);
        }
    }
}
