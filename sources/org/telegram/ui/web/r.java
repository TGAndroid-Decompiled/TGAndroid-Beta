package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f41164a;
    public final c1 f41165b;
    public final n9 f41166c;

    public r(c1 c1Var, n9 n9Var, int i10) {
        this.f41164a = i10;
        this.f41165b = c1Var;
        this.f41166c = n9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41164a) {
            case 0:
                this.f41165b.x(this.f41166c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f41165b.x(this.f41166c, "location_requested", (JSONObject) obj);
                return;
            default:
                c1 c1Var = this.f41165b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n9 n9Var = this.f41166c;
                if (booleanValue) {
                    c1Var.x(n9Var, "home_screen_added", null);
                    return;
                } else {
                    c1Var.x(n9Var, "home_screen_failed", c1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
