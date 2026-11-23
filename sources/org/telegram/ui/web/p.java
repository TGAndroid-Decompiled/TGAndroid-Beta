package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.y10;
public final class p implements y10 {
    public final int f53235a;
    public final v0 f53236b;
    public final f7 f53237c;

    public p(v0 v0Var, f7 f7Var, int i7) {
        this.f53235a = i7;
        this.f53236b = v0Var;
        this.f53237c = f7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53235a) {
            case 0:
                this.f53236b.x(this.f53237c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f53236b.x(this.f53237c, "location_requested", (JSONObject) obj);
                return;
            default:
                v0 v0Var = this.f53236b;
                v0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f7 f7Var = this.f53237c;
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
