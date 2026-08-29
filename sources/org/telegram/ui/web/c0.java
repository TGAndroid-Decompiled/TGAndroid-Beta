package org.telegram.ui.web;

import android.app.Activity;
import nh.d6;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.r9;
public final class c0 implements NotificationCenter.NotificationCenterDelegate {
    public final z0 f43994a;

    public c0(z0 z0Var) {
        this.f43994a = z0Var;
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
                z0 z0Var = this.f43994a;
                if (i13 == 0) {
                    Activity activity = z0Var.S;
                    if (activity != null) {
                        z0Var.f44265c0 = r9.e0(activity, 3, new d6(z0Var, 11));
                        return;
                    }
                    return;
                }
                z0Var.v("scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
