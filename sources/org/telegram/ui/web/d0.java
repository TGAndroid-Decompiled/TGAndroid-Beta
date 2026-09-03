package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.py;
public final class d0 extends py {
    public final boolean[] f42483y4;
    public final a1 z4;

    public d0(a1 a1Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.z4 = a1Var;
        this.f42483y4 = zArr;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.f42483y4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.z4.v("requested_chat_failed", jSONObject);
        }
    }
}
