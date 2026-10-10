package org.telegram.ui.web;

import ai.ea;
import android.app.Activity;
import m.f3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;
public final class c0 implements NotificationCenter.NotificationCenterDelegate {
    public final ea f43322a;
    public final b1 f43323b;

    public c0(b1 b1Var, ea eaVar) {
        this.f43323b = b1Var;
        this.f43322a = eaVar;
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
                b1 b1Var = this.f43323b;
                if (i13 == 0) {
                    Activity activity = b1Var.W;
                    if (activity != null) {
                        b1Var.f43292g0 = v9.e0(activity, false, 3, new f3(b1Var, 11));
                        return;
                    }
                    return;
                }
                b1Var.x(this.f43322a, "scan_qr_popup_closed", new JSONObject());
            }
        }
    }
}
