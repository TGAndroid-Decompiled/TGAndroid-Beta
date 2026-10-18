package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f42731a;
    public final b1 f42732b;
    public final y7 f42733c;

    public t(b1 b1Var, y7 y7Var, int i10) {
        this.f42731a = i10;
        this.f42732b = b1Var;
        this.f42733c = y7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42731a) {
            case 0:
                this.f42732b.x(this.f42733c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42732b.x(this.f42733c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f42732b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y7 y7Var = this.f42733c;
                if (booleanValue) {
                    b1Var.x(y7Var, "home_screen_added", null);
                    return;
                } else {
                    b1Var.x(y7Var, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
