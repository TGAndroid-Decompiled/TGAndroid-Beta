package org.telegram.ui.web;

import android.os.Bundle;
import nh.j7;
import org.json.JSONObject;
import org.telegram.ui.qy;
public final class f0 extends qy {
    public final c1 A4;
    public final boolean[] f39436y4;
    public final j7 z4;

    public f0(c1 c1Var, Bundle bundle, boolean[] zArr, j7 j7Var) {
        super(bundle);
        this.A4 = c1Var;
        this.f39436y4 = zArr;
        this.z4 = j7Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.f39436y4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.A4.z(this.z4, "requested_chat_failed", jSONObject);
        }
    }
}
