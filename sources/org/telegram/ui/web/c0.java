package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.ay;
public final class c0 extends ay {
    public final boolean[] B4;
    public final x0 C4;
    public final z0 D4;

    public c0(z0 z0Var, Bundle bundle, boolean[] zArr, x0 x0Var) {
        super(bundle);
        this.D4 = z0Var;
        this.B4 = zArr;
        this.C4 = x0Var;
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
            this.D4.y(this.C4, "requested_chat_failed", jSONObject);
        }
    }
}
