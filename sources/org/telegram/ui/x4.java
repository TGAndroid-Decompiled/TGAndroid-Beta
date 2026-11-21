package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class x4 implements org.telegram.messenger.fs {
    public final int f53594a;
    public final Object f53595b;

    public x4(Object obj, int i7) {
        this.f53594a = i7;
        this.f53595b = obj;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        switch (this.f53594a) {
            case 0:
                y4 y4Var = (y4) this.f53595b;
                if (y4Var.f54037g && i7 == y4Var.f54035e) {
                    y4Var.b(objArr);
                    return;
                }
                return;
            case 1:
                pb0 pb0Var = (pb0) this.f53595b;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                org.telegram.messenger.ks.e().n(this, 308);
                if (intValue == 200) {
                    try {
                        pb0Var.G = (GoogleSignInAccount) a8.v7.b(intent).getResult(com.google.android.gms.common.api.f.class);
                        pb0Var.h(null);
                        return;
                    } catch (com.google.android.gms.common.api.f e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                sc0 sc0Var = (sc0) this.f53595b;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                org.telegram.messenger.ks.e().n(this, 308);
                if (intValue2 == 200) {
                    try {
                        sc0Var.E = (GoogleSignInAccount) a8.v7.b(intent2).getResult(com.google.android.gms.common.api.f.class);
                        sc0Var.h(null);
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
