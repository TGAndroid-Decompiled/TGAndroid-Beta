package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f42641a;
    public final a1 f42642b;

    public r(a1 a1Var, int i10) {
        this.f42641a = i10;
        this.f42642b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42641a) {
            case 0:
                a1 a1Var = this.f42642b;
                a1Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a1Var.v("home_screen_added", null);
                    return;
                } else {
                    a1Var.v("home_screen_failed", a1.x("UNSUPPORTED", "error"));
                    return;
                }
            case 1:
                this.f42642b.v("location_requested", (JSONObject) obj);
                return;
            default:
                this.f42642b.v("location_requested", (JSONObject) obj);
                return;
        }
    }
}
