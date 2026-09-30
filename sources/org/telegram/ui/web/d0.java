package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f39043a;
    public final b1 f39044b;

    public d0(b1 b1Var, da daVar) {
        this.f39044b = b1Var;
        this.f39043a = daVar;
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
                b1 b1Var = this.f39044b;
                if (i13 == 0) {
                    Activity activity = b1Var.W;
                    if (activity != null) {
                        b1Var.f39007g0 = u9.e0(activity, 3, new n2.e(b1Var, 11));
                        return;
                    }
                    return;
                }
                b1Var.y(this.f39043a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
