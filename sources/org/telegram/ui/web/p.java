package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.q20;
public final class p implements q20 {
    public final int f43156a;
    public final z0 f43157b;
    public final x0 f43158c;

    public p(z0 z0Var, x0 x0Var, int i10) {
        this.f43156a = i10;
        this.f43157b = z0Var;
        this.f43158c = x0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43156a) {
            case 0:
                this.f43157b.y(this.f43158c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43157b.y(this.f43158c, "location_requested", (JSONObject) obj);
                return;
            default:
                z0 z0Var = this.f43157b;
                z0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x0 x0Var = this.f43158c;
                if (booleanValue) {
                    z0Var.y(x0Var, "home_screen_added", null);
                    return;
                } else {
                    z0Var.y(x0Var, "home_screen_failed", z0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
