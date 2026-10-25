package org.telegram.ui.web;

import android.os.Bundle;
import di.x7;
import org.json.JSONObject;
import org.telegram.ui.cy;
public final class f0 extends cy {
    public final boolean[] C4;
    public final x7 D4;
    public final a1 E4;

    public f0(a1 a1Var, Bundle bundle, boolean[] zArr, x7 x7Var) {
        super(bundle);
        this.E4 = a1Var;
        this.C4 = zArr;
        this.D4 = x7Var;
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
