package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.z10;
public final class p implements z10 {
    public final int f52741a;
    public final v0 f52742b;
    public final i7 f52743c;

    public p(v0 v0Var, i7 i7Var, int i7) {
        this.f52741a = i7;
        this.f52742b = v0Var;
        this.f52743c = i7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52741a) {
            case 0:
                this.f52742b.x(this.f52743c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f52742b.x(this.f52743c, "location_requested", (JSONObject) obj);
                return;
            default:
                v0 v0Var = this.f52742b;
                v0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                i7 i7Var = this.f52743c;
                if (booleanValue) {
                    v0Var.x(i7Var, "home_screen_added", null);
                    return;
                } else {
                    v0Var.x(i7Var, "home_screen_failed", v0.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
