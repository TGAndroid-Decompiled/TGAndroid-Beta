package org.telegram.ui.web;

import android.app.Activity;
import bi.n9;
import ji.h5;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.z9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final n9 f41017a;
    public final c1 f41018b;

    public d0(c1 c1Var, n9 n9Var) {
        this.f41018b = c1Var;
        this.f41017a = n9Var;
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
                c1 c1Var = this.f41018b;
                if (i13 == 0) {
                    Activity activity = c1Var.W;
                    if (activity != null) {
                        c1Var.f40991g0 = z9.e0(activity, false, 3, new h5(c1Var, 17));
                        return;
                    }
                    return;
                }
                c1Var.x(this.f41017a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
