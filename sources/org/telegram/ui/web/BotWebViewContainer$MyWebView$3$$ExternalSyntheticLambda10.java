package org.telegram.ui.web;

import android.webkit.PermissionRequest;
import androidx.core.util.Consumer;

public final class BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10 implements Consumer {
    public final int $r8$classId;
    public final BotWebViewContainer.MyWebView.AnonymousClass3 f$0;
    public final PermissionRequest f$1;
    public final String f$2;

    public BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3, PermissionRequest permissionRequest, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
        this.f$1 = permissionRequest;
        this.f$2 = str;
    }

    @Override
    public final void accept(Object obj) {
        String str = this.f$2;
        PermissionRequest permissionRequest = this.f$1;
        BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = this.f$0;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                    } else {
                        BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10 botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10 = new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(anonymousClass3, permissionRequest, str, 2);
                        int i = BotWebViewContainer.tags;
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10, new String[]{"android.permission.RECORD_AUDIO"});
                    }
                }
                break;
            case 1:
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                    } else {
                        BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10 botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda11 = new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(anonymousClass3, permissionRequest, str, 3);
                        int i2 = BotWebViewContainer.tags;
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(botWebViewContainer$MyWebView$3$$ExternalSyntheticLambda11, new String[]{"android.permission.CAMERA"});
                    }
                }
                break;
            case 2:
                anonymousClass3.getClass();
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                } else {
                    permissionRequest.grant(new String[]{str});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
            default:
                anonymousClass3.getClass();
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                } else {
                    permissionRequest.grant(new String[]{str});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
        }
    }
}
