package org.telegram.ui.web;

import android.os.Bundle;
import di.o7;
import org.json.JSONObject;
import org.telegram.ui.ww;
public final class c0 extends ww {
    public final boolean[] B4;
    public final o7 C4;
    public final x0 D4;

    public c0(x0 x0Var, Bundle bundle, boolean[] zArr, o7 o7Var) {
        super(bundle);
        this.D4 = x0Var;
        this.B4 = zArr;
        this.C4 = o7Var;
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
