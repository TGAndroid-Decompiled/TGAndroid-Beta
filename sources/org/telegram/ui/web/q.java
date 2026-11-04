package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.u10;
public final class q implements u10 {
    public final int f50990a;
    public final w0 f50991b;
    public final p7 f50992c;

    public q(w0 w0Var, p7 p7Var, int i3) {
        this.f50990a = i3;
        this.f50991b = w0Var;
        this.f50992c = p7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50990a) {
            case 0:
                this.f50991b.x(this.f50992c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f50991b.x(this.f50992c, "location_requested", (JSONObject) obj);
                return;
            default:
                w0 w0Var = this.f50991b;
                w0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p7 p7Var = this.f50992c;
                if (booleanValue) {
                    w0Var.x(p7Var, "home_screen_added", null);
                    return;
                } else {
                    w0Var.x(p7Var, "home_screen_failed", w0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
