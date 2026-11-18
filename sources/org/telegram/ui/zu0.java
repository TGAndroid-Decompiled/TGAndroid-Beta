package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class zu0 extends wv0 {
    public zu0(Context context) {
        super(context);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fi.s2 s2Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.o5 o5Var = this.f38745e;
        if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
            s2Var.P0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().L()) {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754798, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(2131747624, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.gd.M0(2131754818, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
