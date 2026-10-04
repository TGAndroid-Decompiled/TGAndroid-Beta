package org.telegram.ui.web;

import ai.da;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.uy;
public final class g0 extends uy {
    public final da A4;
    public final c1 B4;
    public final boolean[] f42192z4;

    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, da daVar) {
        super(bundle);
        this.B4 = c1Var;
        this.f42192z4 = zArr;
        this.A4 = daVar;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.f42192z4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.B4.y(this.A4, "requested_chat_failed", jSONObject);
        }
    }
}
