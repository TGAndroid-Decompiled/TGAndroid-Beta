package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f44882a;
    public final a1 f44883b;
    public final x7 f44884c;

    public s(a1 a1Var, x7 x7Var, int i10) {
        this.f44882a = i10;
        this.f44883b = a1Var;
        this.f44884c = x7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44882a) {
            case 0:
                this.f44883b.x(this.f44884c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f44883b.x(this.f44884c, "location_requested", (JSONObject) obj);
                return;
            default:
                a1 a1Var = this.f44883b;
                a1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x7 x7Var = this.f44884c;
                if (booleanValue) {
                    a1Var.x(x7Var, "home_screen_added", null);
                    return;
                } else {
                    a1Var.x(x7Var, "home_screen_failed", a1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
