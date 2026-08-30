package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class wd0 implements NotificationCenter.NotificationCenterDelegate {
    public final yd0 f39400a;

    public wd0(yd0 yd0Var) {
        this.f39400a = yd0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yd0 yd0Var = this.f39400a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                yd0Var.C = (GoogleSignInAccount) k7.y.b(intent).getResult(com.google.android.gms.common.api.f.class);
                yd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
