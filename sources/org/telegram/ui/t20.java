package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t20 extends org.telegram.ui.Components.pi0 {
    public final o50 f42821r;

    public t20(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42821r = o50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        o50 o50Var = this.f42821r;
        int i9 = o50Var.B1;
        if (i9 != 0 && i9 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setEnabled(z10);
        if (o50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o50 o50Var = this.f42821r;
        b20 b20Var = o50Var.f40966u2;
        ArrayList arrayList = o50Var.V1;
        if (o50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && o50Var.B1 == 0 && o50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(b20Var, 300L);
            o50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (o50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(b20Var);
                o50Var.N1 = false;
            } else if (o50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(o50Var.f40962t2);
                o50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        o50Var.f40972w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(o50Var.U1);
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
                }
                o50Var.O1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
