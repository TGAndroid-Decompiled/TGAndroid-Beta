package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class va0 implements OnSuccessListener {
    public final int f52771a = 0;
    public final de0 f52772b;
    public final String f52773c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52774e;
    public final boolean f52775f;

    public va0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52772b = de0Var;
        this.f52774e = bundle;
        this.d = auth_sentcode;
        this.f52773c = str;
        this.f52775f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52771a) {
            case 0:
                de0.a0(this.f52772b, this.f52774e, this.d, this.f52773c, this.f52775f, (IntegrityTokenResponse) obj);
                return;
            default:
                de0.c0(this.f52772b, this.f52773c, this.d, this.f52774e, this.f52775f, (p8.d) obj);
                return;
        }
    }

    public va0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52772b = de0Var;
        this.f52773c = str;
        this.d = auth_sentcode;
        this.f52774e = bundle;
        this.f52775f = z10;
    }
}
