package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.x10;
public final class p implements x10 {
    public final int f53224a;
    public final v0 f53225b;
    public final f7 f53226c;

    public p(v0 v0Var, f7 f7Var, int i7) {
        this.f53224a = i7;
        this.f53225b = v0Var;
        this.f53226c = f7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53224a) {
            case 0:
                this.f53225b.x(this.f53226c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f53225b.x(this.f53226c, "location_requested", (JSONObject) obj);
                return;
            default:
                v0 v0Var = this.f53225b;
                v0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f7 f7Var = this.f53226c;
                if (booleanValue) {
                    v0Var.x(f7Var, "home_screen_added", null);
                    return;
                } else {
                    v0Var.x(f7Var, "home_screen_failed", v0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
