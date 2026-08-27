package org.telegram.ui.web;

import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.t9;

public final class b0 implements NotificationCenter.NotificationCenterDelegate {

    public final z0 f43780a;

    public b0(z0 z0Var) {
        this.f43780a = z0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.onRequestPermissionResultReceived;
        if (i10 == i12) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (iIntValue == 5000) {
                NotificationCenter.getGlobalInstance().removeObserver(this, i12);
                int i13 = iArr[0];
                z0 z0Var = this.f43780a;
                if (i13 != 0) {
                    z0Var.v("scan_qr_popup_closed", new JSONObject());
                    return;
                }
                Activity activity = z0Var.S;
                if (activity == null) {
                    return;
                }
                z0Var.f44062c0 = t9.e0(activity, 3, new n2.b0(z0Var, 13));
            }
        }
    }
}
