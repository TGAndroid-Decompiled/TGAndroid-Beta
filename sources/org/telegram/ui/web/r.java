package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f43442a;
    public final b1 f43443b;
    public final ea f43444c;

    public r(b1 b1Var, ea eaVar, int i10) {
        this.f43442a = i10;
        this.f43443b = b1Var;
        this.f43444c = eaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43442a) {
            case 0:
                this.f43443b.x(this.f43444c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43443b.x(this.f43444c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43443b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ea eaVar = this.f43444c;
                if (booleanValue) {
                    b1Var.x(eaVar, "home_screen_added", null);
                    return;
                } else {
                    b1Var.x(eaVar, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
