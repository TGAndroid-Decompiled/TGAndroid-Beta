package org.telegram.ui.web;

import android.os.Bundle;
import ci.z7;
import org.json.JSONObject;
import org.telegram.ui.ey;
public final class f0 extends ey {
    public final boolean[] B4;
    public final z7 C4;
    public final a1 D4;

    public f0(a1 a1Var, Bundle bundle, boolean[] zArr, z7 z7Var) {
        super(bundle);
        this.D4 = a1Var;
        this.B4 = zArr;
        this.C4 = z7Var;
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
