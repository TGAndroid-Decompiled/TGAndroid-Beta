package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class vi1 extends LinearLayout {
    public final zi1 f37566a;

    public vi1(zi1 zi1Var, Activity activity) {
        super(activity);
        this.f37566a = zi1Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.f37566a.E.getText();
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
