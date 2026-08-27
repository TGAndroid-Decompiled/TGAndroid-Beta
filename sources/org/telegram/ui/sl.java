package org.telegram.ui;

import android.view.accessibility.AccessibilityNodeInfo;

public final class sl extends org.telegram.ui.Cells.v0 {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
    }
}
