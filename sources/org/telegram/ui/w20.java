package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

public final class w20 extends org.telegram.ui.Components.ri0 {

    public final s50 f43580r;

    public w20(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f43580r = s50Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        s50 s50Var = this.f43580r;
        int i10 = s50Var.B1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (s50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s50 s50Var = this.f43580r;
        e20 e20Var = s50Var.f42495u2;
        ArrayList arrayList = s50Var.V1;
        if (s50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && s50Var.B1 == 0 && s50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(e20Var, 300L);
            s50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (s50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(e20Var);
                s50Var.N1 = false;
            } else if (s50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(s50Var.f42491t2);
                s50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        s50Var.f42501w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(s50Var.U1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                s50Var.O1 = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
