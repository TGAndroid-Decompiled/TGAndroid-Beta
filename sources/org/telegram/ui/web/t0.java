package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.m6;
public final class t0 {
    public final String f53310a;
    public final String f53311b;
    public final int f53312c;

    public t0(JSONObject jSONObject) {
        this.f53312c = -1;
        this.f53310a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f53312c = m6.f29619q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f53311b = gd.N0(2131752577, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f53311b = gd.N0(2131747637, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f53311b = gd.N0(2131752029, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f53311b = jSONObject.getString("text");
    }
}
