package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f42171a;
    public final c1 f42172b;

    public e0(c1 c1Var, da daVar) {
        this.f42172b = c1Var;
        this.f42171a = daVar;
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
                c1 c1Var = this.f42172b;
                if (i13 == 0) {
                    Activity activity = c1Var.W;
                    if (activity != null) {
                        c1Var.f42130g0 = w9.e0(activity, 3, new l2.g(c1Var, 11));
                        return;
                    }
                    return;
                }
                c1Var.y(this.f42171a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
