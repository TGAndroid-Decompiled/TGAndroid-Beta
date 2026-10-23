package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
public final class y0 {
    public final String f42864a;
    public final String f42865b;
    public final int f42866c;

    public y0(JSONObject jSONObject) {
        this.f42866c = -1;
        this.f42864a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f42866c = h6.f21232q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f42865b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f42865b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f42865b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f42865b = jSONObject.getString("text");
    }
}
