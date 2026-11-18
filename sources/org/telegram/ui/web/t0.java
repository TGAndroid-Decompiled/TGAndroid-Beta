package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
public final class t0 {
    public final String f53267a;
    public final String f53268b;
    public final int f53269c;

    public t0(JSONObject jSONObject) {
        this.f53269c = -1;
        this.f53267a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f53269c = n6.f29635q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f53268b = gd.M0(2131752578, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f53268b = gd.M0(2131747638, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f53268b = gd.M0(2131752030, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f53268b = jSONObject.getString("text");
    }
}
