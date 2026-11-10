package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.c20;
public final class o implements c20 {
    public final int f51189a;
    public final x0 f51190b;
    public final p7 f51191c;

    public o(x0 x0Var, p7 p7Var, int i7) {
        this.f51189a = i7;
        this.f51190b = x0Var;
        this.f51191c = p7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51189a) {
            case 0:
                this.f51190b.x(this.f51191c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f51190b.x(this.f51191c, "location_requested", (JSONObject) obj);
                return;
            default:
                x0 x0Var = this.f51190b;
                x0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p7 p7Var = this.f51191c;
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
