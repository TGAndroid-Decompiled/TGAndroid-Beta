package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class yu0 extends vv0 {
    public yu0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fi.s2 s2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.o5 o5Var = this.f38432e;
        if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
            s2Var.Q0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().M()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.N0(2131747623, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.gd.N0(2131754817, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
