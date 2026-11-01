package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.r20;
public final class p implements r20 {
    public final int f42958a;
    public final z0 f42959b;
    public final x0 f42960c;

    public p(z0 z0Var, x0 x0Var, int i10) {
        this.f42958a = i10;
        this.f42959b = z0Var;
        this.f42960c = x0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42958a) {
            case 0:
                this.f42959b.y(this.f42960c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42959b.y(this.f42960c, "location_requested", (JSONObject) obj);
                return;
            default:
                z0 z0Var = this.f42959b;
                z0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x0 x0Var = this.f42960c;
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
