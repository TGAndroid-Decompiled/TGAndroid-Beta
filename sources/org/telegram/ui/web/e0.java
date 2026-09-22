package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final da f38910a;
    public final d1 f38911b;

    public e0(d1 d1Var, da daVar) {
        this.f38911b = d1Var;
        this.f38910a = daVar;
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
                d1 d1Var = this.f38911b;
                if (i13 == 0) {
                    Activity activity = d1Var.W;
                    if (activity != null) {
                        d1Var.f38882g0 = v9.e0(activity, 3, new l.d(d1Var, 14));
                        return;
                    }
                    return;
                }
                d1Var.y(this.f38910a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
