package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f42324a;
    public final c1 f42325b;
    public final da f42326c;

    public r(c1 c1Var, da daVar, int i10) {
        this.f42324a = i10;
        this.f42325b = c1Var;
        this.f42326c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42324a) {
            case 0:
                this.f42325b.y(this.f42326c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f42325b.y(this.f42326c, "location_requested", (JSONObject) obj);
                return;
            default:
                c1 c1Var = this.f42325b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f42326c;
                if (booleanValue) {
                    c1Var.y(daVar, "home_screen_added", null);
                    return;
                } else {
                    c1Var.y(daVar, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
