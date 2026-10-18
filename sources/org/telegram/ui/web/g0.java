package org.telegram.ui.web;

import android.os.Bundle;
import ci.y7;
import org.json.JSONObject;
import org.telegram.ui.ey;
public final class g0 extends ey {
    public final boolean[] B4;
    public final y7 C4;
    public final b1 D4;

    public g0(b1 b1Var, Bundle bundle, boolean[] zArr, y7 y7Var) {
        super(bundle);
        this.D4 = b1Var;
        this.B4 = zArr;
        this.C4 = y7Var;
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
