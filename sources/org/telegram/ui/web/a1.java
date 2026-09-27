package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
public final class a1 {
    public final String f38938a;
    public final String f38939b;
    public final int f38940c;

    public a1(JSONObject jSONObject) {
        this.f38940c = -1;
        this.f38938a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f38940c = i6.f19297q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f38939b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f38939b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f38939b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f38939b = jSONObject.getString("text");
    }
}
