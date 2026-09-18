package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f38782a;
    public final d1 f38783b;

    public e0(d1 d1Var, da daVar) {
        this.f38783b = d1Var;
        this.f38782a = daVar;
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
                d1 d1Var = this.f38783b;
                if (i13 == 0) {
                    Activity activity = d1Var.W;
                    if (activity != null) {
                        d1Var.f38751g0 = w9.e0(activity, 3, new k2.u(d1Var, 16));
                        return;
                    }
                    return;
                }
                d1Var.y(this.f38782a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
