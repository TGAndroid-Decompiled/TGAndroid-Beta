package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f41471a;
    public final b1 f41472b;
    public final n9 f41473c;

    public r(b1 b1Var, n9 n9Var, int i10) {
        this.f41471a = i10;
        this.f41472b = b1Var;
        this.f41473c = n9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41471a) {
            case 0:
                this.f41472b.x(this.f41473c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f41472b.x(this.f41473c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f41472b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n9 n9Var = this.f41473c;
                if (booleanValue) {
                    b1Var.x(n9Var, "home_screen_added", null);
                    return;
                } else {
                    b1Var.x(n9Var, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
