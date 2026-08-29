package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class se0 implements NotificationCenter.NotificationCenterDelegate {
    public final te0 f42366a;

    public se0(te0 te0Var) {
        this.f42366a = te0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        te0 te0Var = this.f42366a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                te0Var.f42684y = (GoogleSignInAccount) i7.l.b(intent).getResult(com.google.android.gms.common.api.f.class);
                te0Var.h(null);
            } catch (com.google.android.gms.common.api.f e10) {
                FileLog.e(e10);
            }
        }
    }
}
