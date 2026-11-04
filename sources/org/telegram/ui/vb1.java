package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class vb1 extends LinearLayout {
    public final zb1 f50452a;

    public vb1(zb1 zb1Var, Activity activity) {
        super(activity);
        this.f50452a = zb1Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.f50452a.F.getText();
        if (sharedState != null && !TextUtils.isEmpty(text)) {
            StringBuilder sb2 = new StringBuilder(text);
            sb2.append(", ");
            if (sharedState.getPrivateCall() != null && sharedState.getPrivateCall().video) {
                sb2.append(org.telegram.messenger.bd.M0(2131743307, null));
            } else {
                sb2.append(org.telegram.messenger.bd.M0(2131743310, null));
            }
            long callDuration = sharedState.getCallDuration();
            if (callDuration > 0) {
                sb2.append(", ");
                sb2.append(org.telegram.messenger.bd.z((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb2);
        }
    }
}
