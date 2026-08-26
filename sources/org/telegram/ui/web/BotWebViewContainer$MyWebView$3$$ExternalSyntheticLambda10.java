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
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = this.f$0;
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    boolean zBooleanValue = bool.booleanValue();
                    PermissionRequest permissionRequest = this.f$1;
                    if (!zBooleanValue) {
                        permissionRequest.deny();
                    } else {
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(anonymousClass3, permissionRequest, this.f$2, 2), new String[]{"android.permission.RECORD_AUDIO"});
                    }
                }
                break;
            case 1:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass4 = this.f$0;
                if (anonymousClass4.lastPermissionsDialog != null) {
                    anonymousClass4.lastPermissionsDialog = null;
                    boolean zBooleanValue2 = bool.booleanValue();
                    PermissionRequest permissionRequest2 = this.f$1;
                    if (!zBooleanValue2) {
                        permissionRequest2.deny();
                    } else {
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(anonymousClass4, permissionRequest2, this.f$2, 3), new String[]{"android.permission.CAMERA"});
                    }
                }
                break;
            case 2:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass5 = this.f$0;
                anonymousClass5.getClass();
                boolean zBooleanValue3 = bool.booleanValue();
                PermissionRequest permissionRequest3 = this.f$1;
                if (!zBooleanValue3) {
                    permissionRequest3.deny();
                } else {
                    permissionRequest3.grant(new String[]{this.f$2});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
            default:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass6 = this.f$0;
                anonymousClass6.getClass();
                boolean zBooleanValue4 = bool.booleanValue();
                PermissionRequest permissionRequest4 = this.f$1;
                if (!zBooleanValue4) {
                    permissionRequest4.deny();
                } else {
                    permissionRequest4.grant(new String[]{this.f$2});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
        }
    }
}
