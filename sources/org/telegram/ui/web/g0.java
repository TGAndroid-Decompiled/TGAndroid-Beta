package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.wy;
public final class g0 extends wy {
    public final boolean[] B4;
    public final a1 C4;
    public final c1 D4;

    public g0(c1 c1Var, Bundle bundle, boolean[] zArr, a1 a1Var) {
        super(bundle);
        this.D4 = c1Var;
        this.B4 = zArr;
        this.C4 = a1Var;
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
            this.D4.z(this.C4, "requested_chat_failed", jSONObject);
        }
    }
}
