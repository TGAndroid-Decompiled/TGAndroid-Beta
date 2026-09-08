package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f42268a;
    public final d1 f42269b;
    public final k9 f42270c;

    public t(d1 d1Var, k9 k9Var, int i10) {
        this.f42268a = i10;
        this.f42269b = d1Var;
        this.f42270c = k9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42268a) {
            case 0:
                this.f42269b.y(this.f42270c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42269b.y(this.f42270c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f42269b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k9 k9Var = this.f42270c;
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
