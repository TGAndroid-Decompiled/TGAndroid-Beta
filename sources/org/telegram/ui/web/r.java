package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f43383a;
    public final b1 f43384b;
    public final ea f43385c;

    public r(b1 b1Var, ea eaVar, int i10) {
        this.f43383a = i10;
        this.f43384b = b1Var;
        this.f43385c = eaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43383a) {
            case 0:
                this.f43384b.x(this.f43385c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43384b.x(this.f43385c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43384b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ea eaVar = this.f43385c;
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
