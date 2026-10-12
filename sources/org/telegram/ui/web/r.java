package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f43388a;
    public final b1 f43389b;
    public final ea f43390c;

    public r(b1 b1Var, ea eaVar, int i10) {
        this.f43388a = i10;
        this.f43389b = b1Var;
        this.f43390c = eaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43388a) {
            case 0:
                this.f43389b.x(this.f43390c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43389b.x(this.f43390c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43389b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ea eaVar = this.f43390c;
                if (booleanValue) {
                    b1Var.x(eaVar, "home_screen_added", null);
                    return;
                } else {
                    b1Var.x(eaVar, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
