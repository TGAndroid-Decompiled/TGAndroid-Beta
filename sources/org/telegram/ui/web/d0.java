package org.telegram.ui.web;

import android.app.Activity;
import di.x7;
import li.e3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y9;
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final x7 f44726a;
    public final a1 f44727b;

    public d0(a1 a1Var, x7 x7Var) {
        this.f44727b = a1Var;
        this.f44726a = x7Var;
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
                a1 a1Var = this.f44727b;
                if (i13 == 0) {
                    Activity activity = a1Var.W;
                    if (activity != null) {
                        a1Var.f44675g0 = y9.f0(activity, 3, new e3(a1Var, 13));
                        return;
                    }
                    return;
                }
                a1Var.x(this.f44726a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
