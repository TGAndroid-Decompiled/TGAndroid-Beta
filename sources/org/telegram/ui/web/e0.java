package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.gy;

public final class e0 extends gy {

    public final boolean[] f43817x4;

    public final z0 f43818y4;

    public e0(z0 z0Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.f43818y4 = z0Var;
        this.f43817x4 = zArr;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.f43817x4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.f43818y4.v("requested_chat_failed", jSONObject);
    }
}
