package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f39189a;
    public final b1 f39190b;
    public final da f39191c;

    public r(b1 b1Var, da daVar, int i10) {
        this.f39189a = i10;
        this.f39190b = b1Var;
        this.f39191c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39189a) {
            case 0:
                this.f39190b.y(this.f39191c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39190b.y(this.f39191c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f39190b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f39191c;
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
