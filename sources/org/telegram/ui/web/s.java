package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f43236a;
    public final b1 f43237b;
    public final y7 f43238c;

    public s(b1 b1Var, y7 y7Var, int i10) {
        this.f43236a = i10;
        this.f43237b = b1Var;
        this.f43238c = y7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43236a) {
            case 0:
                this.f43237b.x(this.f43238c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43237b.x(this.f43238c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43237b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y7 y7Var = this.f43238c;
                if (booleanValue) {
                    b1Var.x(y7Var, "home_screen_added", null);
                    return;
                } else {
                    b1Var.x(y7Var, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
