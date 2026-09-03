package org.telegram.ui;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r21 extends org.telegram.ui.Components.jj0 {
    public final t21 f37682r;

    public r21(t21 t21Var, Activity activity) {
        super(activity);
        this.f37682r = t21Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f37682r.P.H) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
        }
    }
}
