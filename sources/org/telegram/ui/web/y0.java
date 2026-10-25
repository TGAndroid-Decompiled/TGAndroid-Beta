package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
public final class y0 {
    public final String f45456a;
    public final String f45457b;
    public final int f45458c;

    public y0(JSONObject jSONObject) {
        this.f45458c = -1;
        this.f45456a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f45458c = y6.f23596q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f45457b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f45457b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f45457b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f45457b = jSONObject.getString("text");
    }
}
