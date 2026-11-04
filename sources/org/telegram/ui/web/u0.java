package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
public final class u0 {
    public final String f51041a;
    public final String f51042b;
    public final int f51043c;

    public u0(JSONObject jSONObject) {
        this.f51043c = -1;
        this.f51041a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f51043c = k6.f28122q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f51042b = bd.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f51042b = bd.M0(2131747839, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f51042b = bd.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f51042b = jSONObject.getString("text");
    }
}
