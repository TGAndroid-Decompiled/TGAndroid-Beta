package qh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r2 extends org.telegram.ui.ActionBar.w0 {
    public final a3 f45933s0;

    public r2(a3 a3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, zVar, 0, 0, false, g6Var);
        this.f45933s0 = a3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f45933s0.f44907y.getText());
    }
}
