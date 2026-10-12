package org.telegram.ui.web;

import android.app.Activity;
import bi.n9;
import ji.d4;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.z9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final n9 f41328a;
    public final b1 f41329b;

    public d0(b1 b1Var, n9 n9Var) {
        this.f41329b = b1Var;
        this.f41328a = n9Var;
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
                b1 b1Var = this.f41329b;
                if (i13 == 0) {
                    Activity activity = b1Var.W;
                    if (activity != null) {
                        b1Var.f41292g0 = z9.e0(activity, false, 3, new d4(b1Var, 16));
                        return;
                    }
                    return;
                }
                b1Var.x(this.f41328a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
