package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.l6;
public final class v0 {
    public final String f51321a;
    public final String f51322b;
    public final int f51323c;

    public v0(JSONObject jSONObject) {
        this.f51323c = -1;
        this.f51321a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f51323c = l6.f28106q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f51322b = id.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f51322b = id.M0(2131747831, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f51322b = id.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f51322b = jSONObject.getString("text");
    }
}
