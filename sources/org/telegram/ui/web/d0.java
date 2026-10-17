package org.telegram.ui.web;

import android.app.Activity;
import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final z7 f42572a;
    public final a1 f42573b;

    public d0(a1 a1Var, z7 z7Var) {
        this.f42573b = a1Var;
        this.f42572a = z7Var;
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
                a1 a1Var = this.f42573b;
                if (i13 == 0) {
                    Activity activity = a1Var.W;
                    if (activity != null) {
                        a1Var.f42524g0 = y9.e0(activity, false, 3, new k0.b(a1Var, 18));
                        return;
                    }
                    return;
                }
                a1Var.x(this.f42572a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
