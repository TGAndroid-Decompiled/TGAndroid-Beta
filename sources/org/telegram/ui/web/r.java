package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f44155a;
    public final z0 f44156b;

    public r(z0 z0Var, int i10) {
        this.f44155a = i10;
        this.f44156b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44155a) {
            case 0:
                z0 z0Var = this.f44156b;
                z0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    z0Var.v("home_screen_added", null);
                    return;
                } else {
                    z0Var.v("home_screen_failed", z0.x("UNSUPPORTED", "error"));
                    return;
                }
            case 1:
                this.f44156b.v("location_requested", (JSONObject) obj);
                return;
            default:
                this.f44156b.v("location_requested", (JSONObject) obj);
                return;
        }
    }
}
