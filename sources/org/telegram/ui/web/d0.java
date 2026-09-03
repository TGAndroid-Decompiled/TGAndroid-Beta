package org.telegram.ui.web;

import android.app.Activity;
import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.x9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final j7 f39420a;
    public final c1 f39421b;

    public d0(c1 c1Var, j7 j7Var) {
        this.f39421b = c1Var;
        this.f39420a = j7Var;
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
                c1 c1Var = this.f39421b;
                if (i13 == 0) {
                    Activity activity = c1Var.T;
                    if (activity != null) {
                        c1Var.f39387d0 = x9.e0(activity, 3, new o3.c(c1Var, 8));
                        return;
                    }
                    return;
                }
                c1Var.z(this.f39420a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
