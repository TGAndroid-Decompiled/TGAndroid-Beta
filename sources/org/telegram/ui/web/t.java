package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f42242a;
    public final d1 f42243b;
    public final k9 f42244c;

    public t(d1 d1Var, k9 k9Var, int i10) {
        this.f42242a = i10;
        this.f42243b = d1Var;
        this.f42244c = k9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42242a) {
            case 0:
                this.f42243b.y(this.f42244c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42243b.y(this.f42244c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f42243b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k9 k9Var = this.f42244c;
                if (booleanValue) {
                    d1Var.y(k9Var, "home_screen_added", null);
                    return;
                } else {
                    d1Var.y(k9Var, "home_screen_failed", d1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
