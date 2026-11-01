package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w4 implements org.telegram.messenger.vs {
    public final int f42667a;
    public final Object f42668b;

    public w4(Object obj, int i10) {
        this.f42667a = i10;
        this.f42668b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.f42667a) {
            case 0:
                x4 x4Var = (x4) this.f42668b;
                if (x4Var.f43226g && i10 == x4Var.e) {
                    x4Var.b(objArr);
                    return;
                }
                return;
            case 1:
                vc0 vc0Var = (vc0) this.f42668b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.at.e().n(this, 305);
                if (intValue == 200) {
                    try {
                        vc0Var.F = (GoogleSignInAccount) w7.n9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        vc0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                yd0 yd0Var = (yd0) this.f42668b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.at.e().n(this, 305);
                if (intValue2 == 200) {
                    try {
                        yd0Var.D = (GoogleSignInAccount) w7.n9.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        yd0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                }
                return;
        }
    }
}
