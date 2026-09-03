package org.telegram.ui.web;

import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;
public final class b0 implements NotificationCenter.NotificationCenterDelegate {
    public final a1 f42471a;

    public b0(a1 a1Var) {
        this.f42471a = a1Var;
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
                a1 a1Var = this.f42471a;
                if (i13 == 0) {
                    Activity activity = a1Var.T;
                    if (activity != null) {
                        a1Var.f42435d0 = v9.e0(activity, 3, new e0(a1Var, 0));
                        return;
                    }
                    return;
                }
                a1Var.v("scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
