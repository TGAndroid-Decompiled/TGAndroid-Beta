package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.k6;
public final class v0 {
    public final String f51340a;
    public final String f51341b;
    public final int f51342c;

    public v0(JSONObject jSONObject) {
        this.f51342c = -1;
        this.f51340a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f51342c = k6.f28093q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f51341b = id.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f51341b = id.M0(2131747832, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f51341b = id.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f51341b = jSONObject.getString("text");
    }
}
