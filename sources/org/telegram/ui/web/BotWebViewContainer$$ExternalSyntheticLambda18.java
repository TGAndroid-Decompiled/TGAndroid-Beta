package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

public final class BotWebViewContainer$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final String[] f$0;
    public final int f$1;
    public final BotWebViewContainer.MyWebView f$2;

    public BotWebViewContainer$$ExternalSyntheticLambda18(String[] strArr, int i, BotWebViewContainer.MyWebView myWebView, int i2) {
        this.$r8$classId = i2;
        this.f$0 = strArr;
        this.f$1 = i;
        this.f$2 = myWebView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                int i = this.f$1;
                BotWebViewContainer.MyWebView myWebView = this.f$2;
                String[] strArr = this.f$0;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        BotWebViewContainer.notifyEvent(i, myWebView, "phone_requested", jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                    break;
                }
                break;
            default:
                String[] strArr2 = this.f$0;
                int i2 = this.f$1;
                BotWebViewContainer.MyWebView myWebView2 = this.f$2;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    BotWebViewContainer.notifyEvent(i2, myWebView2, "write_access_requested", jSONObject2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                break;
        }
    }
}
