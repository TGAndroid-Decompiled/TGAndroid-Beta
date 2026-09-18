package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f38889a;
    public final d1 f38890b;

    public e0(d1 d1Var, da daVar) {
        this.f38890b = d1Var;
        this.f38889a = daVar;
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
                d1 d1Var = this.f38890b;
                if (i13 == 0) {
                    Activity activity = d1Var.W;
                    if (activity != null) {
                        d1Var.f38861g0 = v9.e0(activity, 3, new n2.e(d1Var, 11));
                        return;
                    }
                    return;
                }
                d1Var.y(this.f38889a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
