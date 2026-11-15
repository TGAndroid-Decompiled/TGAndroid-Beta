package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;
public final class t0 {
    public final String f52787a;
    public final String f52788b;
    public final int f52789c;

    public t0(JSONObject jSONObject) {
        this.f52789c = -1;
        this.f52787a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f52789c = j6.f29090q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f52788b = hd.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f52788b = hd.M0(2131747831, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f52788b = hd.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f52788b = jSONObject.getString("text");
    }
}
