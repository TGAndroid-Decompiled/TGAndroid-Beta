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
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = this.f$0;
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    boolean zBooleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.f$1;
                    String str = this.f$2;
                    if (!zBooleanValue) {
                        callback.invoke(str, false, false);
                    } else {
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13(anonymousClass3, callback, str, 1), new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
                    }
                }
                break;
            default:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass4 = this.f$0;
                anonymousClass4.getClass();
                this.f$1.invoke(this.f$2, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
        }
    }
}
