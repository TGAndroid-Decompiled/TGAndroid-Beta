package org.telegram.ui.web;

import android.app.Activity;
import bi.k9;
import ji.u4;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;
public final class f0 implements NotificationCenter.NotificationCenterDelegate {
    public final k9 f42113a;
    public final d1 f42114b;

    public f0(d1 d1Var, k9 k9Var) {
        this.f42114b = d1Var;
        this.f42113a = k9Var;
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
                d1 d1Var = this.f42114b;
                if (i13 == 0) {
                    Activity activity = d1Var.W;
                    if (activity != null) {
                        d1Var.f42073g0 = u9.e0(activity, 3, new u4(d1Var, 15));
                        return;
                    }
                    return;
                }
                d1Var.y(this.f42113a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
