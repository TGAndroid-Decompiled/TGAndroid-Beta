package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class xd0 implements NotificationCenter.NotificationCenterDelegate {
    public final zd0 f43035a;

    public xd0(zd0 zd0Var) {
        this.f43035a = zd0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zd0 zd0Var = this.f43035a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                zd0Var.C = (GoogleSignInAccount) k7.z.b(intent).getResult(com.google.android.gms.common.api.f.class);
                zd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e6) {
                FileLog.e(e6);
            }
        }
    }
}
