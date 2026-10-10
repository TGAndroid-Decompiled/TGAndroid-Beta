package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f43488a;
    public final b1 f43489b;
    public final ea f43490c;

    public r(b1 b1Var, ea eaVar, int i10) {
        this.f43488a = i10;
        this.f43489b = b1Var;
        this.f43490c = eaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43488a) {
            case 0:
                this.f43489b.x(this.f43490c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43489b.x(this.f43490c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43489b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ea eaVar = this.f43490c;
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
