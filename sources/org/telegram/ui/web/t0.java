package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
public final class t0 {
    public final String f53278a;
    public final String f53279b;
    public final int f53280c;

    public t0(JSONObject jSONObject) {
        this.f53280c = -1;
        this.f53278a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f53280c = m6.f29588q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f53279b = hd.N0(2131752577, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f53279b = hd.N0(2131747637, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f53279b = hd.N0(2131752029, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f53279b = jSONObject.getString("text");
    }
}
