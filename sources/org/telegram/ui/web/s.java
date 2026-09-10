package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f38071a;
    public final c1 f38072b;
    public final a1 f38073c;

    public s(c1 c1Var, a1 a1Var, int i10) {
        this.f38071a = i10;
        this.f38072b = c1Var;
        this.f38073c = a1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38071a) {
            case 0:
                this.f38072b.z(this.f38073c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f38072b.z(this.f38073c, "location_requested", (JSONObject) obj);
                return;
            default:
                c1 c1Var = this.f38072b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a1 a1Var = this.f38073c;
                if (booleanValue) {
                    c1Var.z(a1Var, "home_screen_added", null);
                    return;
                } else {
                    c1Var.z(a1Var, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
