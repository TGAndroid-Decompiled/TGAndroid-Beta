package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.fy;
public final class e0 extends fy {
    public final boolean[] x4;
    public final z0 f44017y4;

    public e0(z0 z0Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.f44017y4 = z0Var;
        this.x4 = zArr;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.x4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.f44017y4.v("requested_chat_failed", jSONObject);
        }
    }
}
