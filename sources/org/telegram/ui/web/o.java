package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.c20;
public final class o implements c20 {
    public final int f51247a;
    public final x0 f51248b;
    public final o7 f51249c;

    public o(x0 x0Var, o7 o7Var, int i7) {
        this.f51247a = i7;
        this.f51248b = x0Var;
        this.f51249c = o7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51247a) {
            case 0:
                this.f51248b.x(this.f51249c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f51248b.x(this.f51249c, "location_requested", (JSONObject) obj);
                return;
            default:
                x0 x0Var = this.f51248b;
                x0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o7 o7Var = this.f51249c;
                if (booleanValue) {
                    x0Var.x(o7Var, "home_screen_added", null);
                    return;
                } else {
                    x0Var.x(o7Var, "home_screen_failed", x0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
