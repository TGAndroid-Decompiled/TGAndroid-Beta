package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.c20;
public final class o implements c20 {
    public final int f51235a;
    public final x0 f51236b;
    public final p7 f51237c;

    public o(x0 x0Var, p7 p7Var, int i7) {
        this.f51235a = i7;
        this.f51236b = x0Var;
        this.f51237c = p7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51235a) {
            case 0:
                this.f51236b.x(this.f51237c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f51236b.x(this.f51237c, "location_requested", (JSONObject) obj);
                return;
            default:
                x0 x0Var = this.f51236b;
                x0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p7 p7Var = this.f51237c;
                if (booleanValue) {
                    x0Var.x(p7Var, "home_screen_added", null);
                    return;
                } else {
                    x0Var.x(p7Var, "home_screen_failed", x0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
