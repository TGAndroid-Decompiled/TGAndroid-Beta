package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class z4 implements org.telegram.messenger.cs {
    public final int f52525a;
    public final Object f52526b;

    public z4(Object obj, int i3) {
        this.f52525a = i3;
        this.f52526b = obj;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        switch (this.f52525a) {
            case 0:
                a5 a5Var = (a5) this.f52526b;
                if (a5Var.f43601g && i3 == a5Var.f43599e) {
                    a5Var.b(objArr);
                    return;
                }
                return;
            case 1:
                lb0 lb0Var = (lb0) this.f52526b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.hs.e().n(this, 305);
                if (intValue == 200) {
                    try {
                        lb0Var.G = (GoogleSignInAccount) b8.h1.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        lb0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                qc0 qc0Var = (qc0) this.f52526b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.hs.e().n(this, 305);
                if (intValue2 == 200) {
                    try {
                        qc0Var.E = (GoogleSignInAccount) b8.h1.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        qc0Var.h(null);
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
