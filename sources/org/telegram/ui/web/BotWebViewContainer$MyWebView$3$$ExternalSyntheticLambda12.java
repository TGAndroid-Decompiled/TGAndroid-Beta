package org.telegram.ui.web;

import android.webkit.PermissionRequest;
import androidx.core.util.Consumer;

public final class BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12 implements Consumer {
    public final int $r8$classId;
    public final BotWebViewContainer.MyWebView.AnonymousClass3 f$0;
    public final PermissionRequest f$1;
    public final String[] f$2;

    public BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3, PermissionRequest permissionRequest, String[] strArr, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass3;
        this.f$1 = permissionRequest;
        this.f$2 = strArr;
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
                        BotWebViewContainer.MyWebView.this.botWebViewContainer.runWithPermissions(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(anonymousClass3, permissionRequest, this.f$2, 1), new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
                    }
                }
                break;
            default:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass4 = this.f$0;
                anonymousClass4.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                PermissionRequest permissionRequest2 = this.f$1;
                if (!zBooleanValue2) {
                    permissionRequest2.deny();
                } else {
                    String[] strArr = this.f$2;
                    permissionRequest2.grant(new String[]{strArr[0], strArr[1]});
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
                break;
        }
    }
}
