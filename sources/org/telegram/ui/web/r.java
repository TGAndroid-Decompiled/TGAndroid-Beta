package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f39144a;
    public final c1 f39145b;
    public final da f39146c;

    public r(c1 c1Var, da daVar, int i10) {
        this.f39144a = i10;
        this.f39145b = c1Var;
        this.f39146c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39144a) {
            case 0:
                this.f39145b.y(this.f39146c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39145b.y(this.f39146c, "location_requested", (JSONObject) obj);
                return;
            default:
                c1 c1Var = this.f39145b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f39146c;
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
