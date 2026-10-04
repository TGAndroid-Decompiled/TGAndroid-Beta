package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
public final class a1 {
    public final String f42101a;
    public final String f42102b;
    public final int f42103c;

    public a1(JSONObject jSONObject) {
        this.f42103c = -1;
        this.f42101a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f42103c = i6.f21063q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f42102b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f42102b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f42102b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f42102b = jSONObject.getString("text");
    }
}
