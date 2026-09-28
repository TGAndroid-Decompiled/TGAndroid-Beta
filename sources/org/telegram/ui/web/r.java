package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f39188a;
    public final b1 f39189b;
    public final da f39190c;

    public r(b1 b1Var, da daVar, int i10) {
        this.f39188a = i10;
        this.f39189b = b1Var;
        this.f39190c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39188a) {
            case 0:
                this.f39189b.y(this.f39190c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39189b.y(this.f39190c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f39189b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f39190c;
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
