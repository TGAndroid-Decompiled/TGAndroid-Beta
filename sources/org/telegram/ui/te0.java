package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class te0 implements NotificationCenter.NotificationCenterDelegate {
    public final ue0 f42973a;

    public te0(ue0 ue0Var) {
        this.f42973a = ue0Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ue0 ue0Var = this.f42973a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ue0Var.f43238y = (GoogleSignInAccount) f7.s8.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ue0Var.h(null);
            } catch (com.google.android.gms.common.api.f e10) {
                FileLog.e(e10);
            }
        }
    }
}
