package org.telegram.ui.web;

import android.os.Bundle;
import fi.f7;
import org.json.JSONObject;
import org.telegram.ui.cx;
public final class b0 extends cx {
    public final boolean[] G4;
    public final f7 H4;
    public final v0 I4;

    public b0(v0 v0Var, Bundle bundle, boolean[] zArr, f7 f7Var) {
        super(bundle);
        this.I4 = v0Var;
        this.G4 = zArr;
        this.H4 = f7Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.G4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.I4.x(this.H4, "requested_chat_failed", jSONObject);
        }
    }
}
