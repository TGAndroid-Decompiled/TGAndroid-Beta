package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class vd1 extends LinearLayout {
    public final zd1 f42503a;

    public vd1(zd1 zd1Var, Activity activity) {
        super(activity);
        this.f42503a = zd1Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.f42503a.E.getText();
        if (sharedState != null && !TextUtils.isEmpty(text)) {
            StringBuilder sb2 = new StringBuilder(text);
            sb2.append(", ");
            if (sharedState.getPrivateCall() != null && sharedState.getPrivateCall().video) {
                sb2.append(org.telegram.messenger.dd.L0(2131743323, null));
            } else {
                sb2.append(org.telegram.messenger.dd.L0(2131743326, null));
            }
            long callDuration = sharedState.getCallDuration();
            if (callDuration > 0) {
                sb2.append(", ");
                sb2.append(org.telegram.messenger.dd.z((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb2);
        }
    }
}
