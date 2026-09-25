package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class yd0 implements NotificationCenter.NotificationCenterDelegate {
    public final ae0 f40127a;

    public yd0(ae0 ae0Var) {
        this.f40127a = ae0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ae0 ae0Var = this.f40127a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ae0Var.F = (GoogleSignInAccount) w7.e9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ae0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
