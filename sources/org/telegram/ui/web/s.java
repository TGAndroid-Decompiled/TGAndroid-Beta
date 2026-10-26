package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f45371a;
    public final a1 f45372b;
    public final x7 f45373c;

    public s(a1 a1Var, x7 x7Var, int i10) {
        this.f45371a = i10;
        this.f45372b = a1Var;
        this.f45373c = x7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45371a) {
            case 0:
                this.f45372b.x(this.f45373c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f45372b.x(this.f45373c, "location_requested", (JSONObject) obj);
                return;
            default:
                a1 a1Var = this.f45372b;
                a1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x7 x7Var = this.f45373c;
                if (booleanValue) {
                    a1Var.x(x7Var, "home_screen_added", null);
                    return;
                } else {
                    a1Var.x(x7Var, "home_screen_failed", a1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
