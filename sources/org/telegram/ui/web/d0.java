package org.telegram.ui.web;

import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.ui.dy;
public final class d0 extends dy {
    public final boolean[] f43830x4;
    public final y0 f43831y4;

    public d0(y0 y0Var, Bundle bundle, boolean[] zArr) {
        super(bundle);
        this.f43831y4 = y0Var;
        this.f43830x4 = zArr;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.f43830x4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.f43831y4.v("requested_chat_failed", jSONObject);
        }
    }
}
