package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.t6;
public final class w0 {
    public final String f43224a;
    public final String f43225b;
    public final int f43226c;

    public w0(JSONObject jSONObject) {
        this.f43226c = -1;
        this.f43224a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f43226c = t6.f21170q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f43225b = cd.L0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f43225b = cd.L0(2131747847, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f43225b = cd.L0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f43225b = jSONObject.getString("text");
    }
}
