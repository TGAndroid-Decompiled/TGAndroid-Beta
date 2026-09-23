package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f38817a;
    public final b1 f38818b;
    public final da f38819c;

    public r(b1 b1Var, da daVar, int i10) {
        this.f38817a = i10;
        this.f38818b = b1Var;
        this.f38819c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38817a) {
            case 0:
                this.f38818b.y(this.f38819c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f38818b.y(this.f38819c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f38818b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f38819c;
                if (booleanValue) {
                    b1Var.y(daVar, "home_screen_added", null);
                    return;
                } else {
                    b1Var.y(daVar, "home_screen_failed", b1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
