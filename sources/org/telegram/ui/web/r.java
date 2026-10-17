package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f42716a;
    public final a1 f42717b;
    public final z7 f42718c;

    public r(a1 a1Var, z7 z7Var, int i10) {
        this.f42716a = i10;
        this.f42717b = a1Var;
        this.f42718c = z7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42716a) {
            case 0:
                this.f42717b.x(this.f42718c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42717b.x(this.f42718c, "location_requested", (JSONObject) obj);
                return;
            default:
                a1 a1Var = this.f42717b;
                a1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z7 z7Var = this.f42718c;
                if (booleanValue) {
                    a1Var.x(z7Var, "home_screen_added", null);
                    return;
                } else {
                    a1Var.x(z7Var, "home_screen_failed", a1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
