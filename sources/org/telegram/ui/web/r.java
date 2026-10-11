package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f43633a;
    public final b1 f43634b;
    public final ea f43635c;

    public r(b1 b1Var, ea eaVar, int i10) {
        this.f43633a = i10;
        this.f43634b = b1Var;
        this.f43635c = eaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43633a) {
            case 0:
                this.f43634b.x(this.f43635c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f43634b.x(this.f43635c, "location_requested", (JSONObject) obj);
                return;
            default:
                b1 b1Var = this.f43634b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ea eaVar = this.f43635c;
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
