package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.uy;
public final class g0 extends uy {
    public final boolean[] A4;
    public final da B4;
    public final d1 C4;

    public g0(d1 d1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.C4 = d1Var;
        this.A4 = zArr;
        this.B4 = daVar;
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
            this.C4.y(this.B4, "requested_chat_failed", jSONObject);
        }
    }
}
