package org.telegram.ui.web;

import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s9;
public final class a0 implements NotificationCenter.NotificationCenterDelegate {
    public final y0 f43793a;

    public a0(y0 y0Var) {
        this.f43793a = y0Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.onRequestPermissionResultReceived;
        if (i9 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == 5000) {
                NotificationCenter.getGlobalInstance().removeObserver(this, i11);
                int i12 = iArr[0];
                y0 y0Var = this.f43793a;
                if (i12 == 0) {
                    Activity activity = y0Var.S;
                    if (activity != null) {
                        y0Var.f44075c0 = s9.d0(activity, 3, new n5.a0(y0Var, 11));
                        return;
                    }
                    return;
                }
                y0Var.v("scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
