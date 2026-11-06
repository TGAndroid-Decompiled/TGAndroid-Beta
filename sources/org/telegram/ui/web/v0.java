package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.k6;
public final class v0 {
    public final String f51328a;
    public final String f51329b;
    public final int f51330c;

    public v0(JSONObject jSONObject) {
        this.f51330c = -1;
        this.f51328a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f51330c = k6.f28089q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f51329b = hd.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f51329b = hd.M0(2131747830, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f51329b = hd.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f51329b = jSONObject.getString("text");
    }
}
