package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class x20 extends org.telegram.ui.Components.aj0 {
    public final r50 f44441r;

    public x20(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44441r = r50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        r50 r50Var = this.f44441r;
        int i10 = r50Var.B1;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (r50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r50 r50Var = this.f44441r;
        d20 d20Var = r50Var.f41953u2;
        ArrayList arrayList = r50Var.V1;
        if (r50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && r50Var.B1 == 0 && r50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(d20Var, 300L);
            r50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (r50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(d20Var);
                r50Var.N1 = false;
            } else if (r50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(r50Var.f41949t2);
                r50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        r50Var.f41959w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(r50Var.U1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                r50Var.O1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
