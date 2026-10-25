package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class ue0 implements NotificationCenter.NotificationCenterDelegate {
    public final ve0 f44115a;

    public ue0(ve0 ve0Var) {
        this.f44115a = ve0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ve0 ve0Var = this.f44115a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ve0Var.f44787y = (GoogleSignInAccount) a.a.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ve0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
