package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class q implements Utilities.Callback {
    public final int f43965a;
    public final y0 f43966b;

    public q(y0 y0Var, int i9) {
        this.f43965a = i9;
        this.f43966b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43965a) {
            case 0:
                y0 y0Var = this.f43966b;
                y0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    y0Var.v("home_screen_added", null);
                    return;
                } else {
                    y0Var.v("home_screen_failed", y0.x("UNSUPPORTED", "error"));
                    return;
                }
            case 1:
                this.f43966b.v("location_requested", (JSONObject) obj);
                return;
            default:
                this.f43966b.v("location_requested", (JSONObject) obj);
                return;
        }
    }
}
