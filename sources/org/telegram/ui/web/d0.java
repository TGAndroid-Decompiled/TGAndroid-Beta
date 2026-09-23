package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f38675a;
    public final b1 f38676b;

    public d0(b1 b1Var, da daVar) {
        this.f38676b = b1Var;
        this.f38675a = daVar;
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
                b1 b1Var = this.f38676b;
                if (i13 == 0) {
                    Activity activity = b1Var.W;
                    if (activity != null) {
                        b1Var.f38639g0 = u9.e0(activity, 3, new k2.u(b1Var, 16));
                        return;
                    }
                    return;
                }
                b1Var.y(this.f38675a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
