package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class we0 implements NotificationCenter.NotificationCenterDelegate {
    public final xe0 f43011a;

    public we0(xe0 xe0Var) {
        this.f43011a = xe0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xe0 xe0Var = this.f43011a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                xe0Var.f43543y = (GoogleSignInAccount) w7.b9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                xe0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
