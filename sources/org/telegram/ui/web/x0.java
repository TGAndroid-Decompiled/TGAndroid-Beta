package org.telegram.ui.web;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;

public final class x0 {

    public final String f44042a;

    public final String f44043b;

    public final int f44044c;

    public x0(JSONObject jSONObject) throws JSONException {
        this.f44044c = -1;
        this.f44042a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.f44044c = g6.f23284q7;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.f44043b = LocaleController.getString(R.string.Cancel);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.f44043b = LocaleController.getString(R.string.OK);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.f44043b = LocaleController.getString(R.string.Close);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.f44043b = jSONObject.getString("text");
    }
}
