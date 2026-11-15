package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.z10;
public final class p implements z10 {
    public final int f52744a;
    public final v0 f52745b;
    public final i7 f52746c;

    public p(v0 v0Var, i7 i7Var, int i7) {
        this.f52744a = i7;
        this.f52745b = v0Var;
        this.f52746c = i7Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52744a) {
            case 0:
                this.f52745b.x(this.f52746c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f52745b.x(this.f52746c, "location_requested", (JSONObject) obj);
                return;
            default:
                v0 v0Var = this.f52745b;
                v0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                i7 i7Var = this.f52746c;
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
