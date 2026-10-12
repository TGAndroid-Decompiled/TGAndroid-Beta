package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class s30 extends org.telegram.ui.Components.bk0 {
    public final n60 f39965r;

    public s30(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39965r = n60Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        n60 n60Var = this.f39965r;
        int i10 = n60Var.F1;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (n60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n60 n60Var = this.f39965r;
        z20 z20Var = n60Var.f38545y2;
        ArrayList arrayList = n60Var.Z1;
        if (n60Var.s1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && n60Var.F1 == 0 && n60Var.f38442a1 != null) {
            AndroidUtilities.runOnUIThread(z20Var, 300L);
            n60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (n60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(z20Var);
                n60Var.R1 = false;
            } else if (n60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(n60Var.f38540x2);
                n60Var.K1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        n60Var.f38532w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(n60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                n60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
