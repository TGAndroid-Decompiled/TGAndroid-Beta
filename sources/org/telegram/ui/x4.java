package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class x4 implements org.telegram.messenger.ls {
    public final int f51541a;
    public final Object f51542b;

    public x4(Object obj, int i7) {
        this.f51541a = i7;
        this.f51542b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f51541a) {
            case 0:
                y4 y4Var = (y4) this.f51542b;
                if (y4Var.f51854g && i7 == y4Var.f51852e) {
                    y4Var.b(objArr);
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f51542b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.qs.e().n(this, 305);
                if (intValue == 200) {
                    try {
                        qb0Var.F = (GoogleSignInAccount) a8.u7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        qb0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                uc0 uc0Var = (uc0) this.f51542b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.qs.e().n(this, 305);
                if (intValue2 == 200) {
                    try {
                        uc0Var.D = (GoogleSignInAccount) a8.u7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        uc0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
        }
    }
}
