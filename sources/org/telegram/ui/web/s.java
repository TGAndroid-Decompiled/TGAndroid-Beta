package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f39572a;
    public final c1 f39573b;
    public final j7 f39574c;

    public s(c1 c1Var, j7 j7Var, int i10) {
        this.f39572a = i10;
        this.f39573b = c1Var;
        this.f39574c = j7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39572a) {
            case 0:
                this.f39573b.z(this.f39574c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39573b.z(this.f39574c, "location_requested", (JSONObject) obj);
                return;
            default:
                c1 c1Var = this.f39573b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j7 j7Var = this.f39574c;
                if (booleanValue) {
                    c1Var.z(j7Var, "home_screen_added", null);
                    return;
                } else {
                    c1Var.z(j7Var, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
