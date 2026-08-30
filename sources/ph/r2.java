package ph;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r2 extends org.telegram.ui.ActionBar.w0 {
    public final a3 f42238s0;

    public r2(a3 a3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f42238s0 = a3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f42238s0.f41269y.getText());
    }
}
