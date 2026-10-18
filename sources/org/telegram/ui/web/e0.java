package org.telegram.ui.web;

import android.app.Activity;
import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final y7 f42578a;
    public final b1 f42579b;

    public e0(b1 b1Var, y7 y7Var) {
        this.f42579b = b1Var;
        this.f42578a = y7Var;
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
                b1 b1Var = this.f42579b;
                if (i13 == 0) {
                    Activity activity = b1Var.W;
                    if (activity != null) {
                        b1Var.f42529g0 = y9.e0(activity, false, 3, new k0.b(b1Var, 18));
                        return;
                    }
                    return;
                }
                b1Var.x(this.f42578a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
