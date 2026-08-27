package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

public final class r implements Utilities.Callback {

    public final int f43952a;

    public final z0 f43953b;

    public r(z0 z0Var, int i10) {
        this.f43952a = i10;
        this.f43953b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43952a) {
            case 0:
                z0 z0Var = this.f43953b;
                z0Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    z0Var.v("home_screen_failed", z0.x("UNSUPPORTED", "error"));
                } else {
                    z0Var.v("home_screen_added", null);
                }
                break;
            case 1:
                this.f43953b.v("location_requested", (JSONObject) obj);
                break;
            default:
                this.f43953b.v("location_requested", (JSONObject) obj);
                break;
        }
    }
}
