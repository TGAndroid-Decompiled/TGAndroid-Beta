package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.uy;
public final class g0 extends uy {
    public final boolean[] B4;
    public final da C4;
    public final d1 D4;

    public g0(d1 d1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.D4 = d1Var;
        this.B4 = zArr;
        this.C4 = daVar;
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
