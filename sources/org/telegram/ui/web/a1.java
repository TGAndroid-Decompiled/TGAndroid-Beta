package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class a1 {
    public final String f40960a;
    public final String f40961b;
    public final int f40962c;

    public a1(JSONObject jSONObject) {
        this.f40962c = -1;
        this.f40960a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f40962c = g6.f19839q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f40961b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f40961b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f40961b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f40961b = jSONObject.getString("text");
    }
}
