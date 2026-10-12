package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class zi1 extends LinearLayout {
    public final dj1 f42638a;

    public zi1(dj1 dj1Var, Activity activity) {
        super(activity);
        this.f42638a = dj1Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.f42638a.E.getText();
        if (sharedState != null && !TextUtils.isEmpty(text)) {
            StringBuilder sb2 = new StringBuilder(text);
            sb2.append(", ");
            if (sharedState.getPrivateCall() != null && sharedState.getPrivateCall().video) {
                sb2.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipInCallBranding));
            }
            long callDuration = sharedState.getCallDuration();
            if (callDuration > 0) {
                sb2.append(", ");
                sb2.append(LocaleController.formatDuration((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb2);
        }
    }
}
