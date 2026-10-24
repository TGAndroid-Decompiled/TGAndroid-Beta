package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class uc0 implements OnSuccessListener {
    public final int f42383a = 0;
    public final hg0 f42384b;
    public final String f42385c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f42386f;

    public uc0(hg0 hg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f42384b = hg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f42385c = str;
        this.f42386f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f42383a) {
            case 0:
                hg0.X(this.f42384b, this.e, this.d, this.f42385c, this.f42386f, (IntegrityTokenResponse) obj);
                return;
            default:
                hg0.V(this.f42384b, this.f42385c, this.d, this.e, this.f42386f, (m8.d) obj);
                return;
        }
    }

    public uc0(hg0 hg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f42384b = hg0Var;
        this.f42385c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f42386f = z10;
    }
}
