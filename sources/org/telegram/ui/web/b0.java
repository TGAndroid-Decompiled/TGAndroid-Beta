package org.telegram.ui.web;

import android.os.Bundle;
import fi.i7;
import org.json.JSONObject;
import org.telegram.ui.yw;
public final class b0 extends yw {
    public final boolean[] D4;
    public final i7 E4;
    public final v0 F4;

    public b0(v0 v0Var, Bundle bundle, boolean[] zArr, i7 i7Var) {
        super(bundle);
        this.F4 = v0Var;
        this.D4 = zArr;
        this.E4 = i7Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.D4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.F4.x(this.E4, "requested_chat_failed", jSONObject);
        }
    }
}
