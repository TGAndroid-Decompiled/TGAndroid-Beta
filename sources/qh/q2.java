package qh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q2 extends org.telegram.ui.ActionBar.w0 {
    public final z2 f45912s0;

    public q2(z2 z2Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, zVar, 0, 0, false, g6Var);
        this.f45912s0 = z2Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f45912s0.f46402y.getText());
    }
}
