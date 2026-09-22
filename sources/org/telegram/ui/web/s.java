package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f39082a;
    public final d1 f39083b;
    public final da f39084c;

    public s(d1 d1Var, da daVar, int i10) {
        this.f39082a = i10;
        this.f39083b = d1Var;
        this.f39084c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39082a) {
            case 0:
                this.f39083b.y(this.f39084c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39083b.y(this.f39084c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f39083b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f39084c;
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
