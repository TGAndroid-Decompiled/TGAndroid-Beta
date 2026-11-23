package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
public final class t0 {
    public final String f53549a;
    public final String f53550b;
    public final int f53551c;

    public t0(JSONObject jSONObject) {
        this.f53551c = -1;
        this.f53549a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f53551c = n6.f29692q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f53550b = gd.N0(2131752577, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f53550b = gd.N0(2131747637, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f53550b = gd.N0(2131752029, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f53550b = jSONObject.getString("text");
    }
}
