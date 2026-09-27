package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.x9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f39004a;
    public final c1 f39005b;

    public e0(c1 c1Var, da daVar) {
        this.f39005b = c1Var;
        this.f39004a = daVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.onRequestPermissionResultReceived;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == 5000) {
                NotificationCenter.getGlobalInstance().removeObserver(this, i12);
                int i13 = iArr[0];
                c1 c1Var = this.f39005b;
                if (i13 == 0) {
                    Activity activity = c1Var.W;
                    if (activity != null) {
                        c1Var.f38968g0 = x9.e0(activity, 3, new o0.c(c1Var, 8));
                        return;
                    }
                    return;
                }
                c1Var.y(this.f39004a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
