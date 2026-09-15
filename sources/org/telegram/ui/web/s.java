package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f39078a;
    public final d1 f39079b;
    public final da f39080c;

    public s(d1 d1Var, da daVar, int i10) {
        this.f39078a = i10;
        this.f39079b = d1Var;
        this.f39080c = daVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39078a) {
            case 0:
                this.f39079b.y(this.f39080c, "location_requested", (JSONObject) obj);
                return;
            case 1:
                this.f39079b.y(this.f39080c, "location_requested", (JSONObject) obj);
                return;
            default:
                d1 d1Var = this.f39079b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.f39080c;
                if (booleanValue) {
                    d1Var.y(daVar, "home_screen_added", null);
                    return;
                } else {
                    d1Var.y(daVar, "home_screen_failed", d1.B("UNSUPPORTED", "error"));
                    return;
                }
        }
    }
}
