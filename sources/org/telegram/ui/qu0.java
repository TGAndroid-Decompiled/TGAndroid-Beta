package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class qu0 extends nv0 {
    public qu0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ei.c3 c3Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.g5 g5Var = this.f35345e;
        if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
            c3Var.P0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131747825, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.bd.M0(2131754818, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
