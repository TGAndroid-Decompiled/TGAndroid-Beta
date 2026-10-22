package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f42773a;
    public final a1 f42774b;
    public final z7 f42775c;

    public s(a1 a1Var, z7 z7Var, int i10) {
        this.f42773a = i10;
        this.f42774b = a1Var;
        this.f42775c = z7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42773a) {
            case 0:
                this.f42774b.x(this.f42775c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42774b.x(this.f42775c, "location_requested", (JSONObject) obj);
                return;
            default:
                a1 a1Var = this.f42774b;
                a1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z7 z7Var = this.f42775c;
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
