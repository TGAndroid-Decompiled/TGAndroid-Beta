package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;
import androidx.core.util.Consumer;

public final class BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13 implements Consumer {
    public final int $r8$classId;
    public final BotWebViewContainer.MyWebView.AnonymousClass3 f$0;
    public final GeolocationPermissions.Callback f$1;
    public final String f$2;

    public BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13(BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3, GeolocationPermissions.Callback callback, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
        this.f$1 = callback;
        this.f$2 = str;
    }

    @Override
    public final void accept(Object obj) {
        int i = 1;
        String str = this.f$2;
        GeolocationPermissions.Callback callback = this.f$1;
        BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = this.f$0;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (!bool.booleanValue()) {
                        callback.invoke(str, false, false);
                    } else {
                        BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13 botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13 = new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13(anonymousClass3, callback, str, i);
                        int i2 = BotWebViewContainer.tags;
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
                    }
                }
                break;
            default:
                anonymousClass3.getClass();
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
        }
    }
}
