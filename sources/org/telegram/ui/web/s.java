package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f38921a;
    public final d1 f38922b;
    public final da f38923c;

    public s(d1 d1Var, da daVar, int i10) {
        this.f38921a = i10;
        this.f38922b = d1Var;
        this.f38923c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38921a) {
            case 0:
                this.f38922b.y(this.f38923c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f38922b.y(this.f38923c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f38922b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f38923c;
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
