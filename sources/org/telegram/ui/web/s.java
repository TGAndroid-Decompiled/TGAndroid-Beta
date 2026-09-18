package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f38926a;
    public final d1 f38927b;
    public final da f38928c;

    public s(d1 d1Var, da daVar, int i10) {
        this.f38926a = i10;
        this.f38927b = d1Var;
        this.f38928c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38926a) {
            case 0:
                this.f38927b.y(this.f38928c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f38927b.y(this.f38928c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f38927b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f38928c;
                if (booleanValue) {
                    d1Var.y(daVar, "home_screen_added", null);
                    return;
                } else {
                    d1Var.y(daVar, "home_screen_failed", d1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
