package org.telegram.ui.web;

import android.app.Activity;
import m.g3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final a1 f37924a;
    public final c1 f37925b;

    public e0(c1 c1Var, a1 a1Var) {
        this.f37925b = c1Var;
        this.f37924a = a1Var;
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
                c1 c1Var = this.f37925b;
                if (i13 == 0) {
                    Activity activity = c1Var.W;
                    if (activity != null) {
                        c1Var.f37886g0 = u9.e0(activity, 3, new g3(c1Var, 11));
                        return;
                    }
                    return;
                }
                c1Var.z(this.f37924a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
