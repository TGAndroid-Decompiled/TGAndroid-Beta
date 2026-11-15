package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class x4 implements org.telegram.messenger.is {
    public final int f53089a;
    public final Object f53090b;

    public x4(Object obj, int i7) {
        this.f53089a = i7;
        this.f53090b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f53089a) {
            case 0:
                y4 y4Var = (y4) this.f53090b;
                if (y4Var.f53413g && i7 == y4Var.f53411e) {
                    y4Var.b(objArr);
                    return;
                }
                return;
            case 1:
                ob0 ob0Var = (ob0) this.f53090b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.ns.e().n(this, 305);
                if (intValue == 200) {
                    try {
                        ob0Var.G = (GoogleSignInAccount) a8.v7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        ob0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                rc0 rc0Var = (rc0) this.f53090b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.ns.e().n(this, 305);
                if (intValue2 == 200) {
                    try {
                        rc0Var.E = (GoogleSignInAccount) a8.v7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        rc0Var.h(null);
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
