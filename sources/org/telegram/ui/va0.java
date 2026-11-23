package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class va0 implements OnSuccessListener {
    public final int f52775a = 0;
    public final de0 f52776b;
    public final String f52777c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52778e;
    public final boolean f52779f;

    public va0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52776b = de0Var;
        this.f52778e = bundle;
        this.d = auth_sentcode;
        this.f52777c = str;
        this.f52779f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52775a) {
            case 0:
                de0.a0(this.f52776b, this.f52778e, this.d, this.f52777c, this.f52779f, (IntegrityTokenResponse) obj);
                return;
            default:
                de0.c0(this.f52776b, this.f52777c, this.d, this.f52778e, this.f52779f, (p8.d) obj);
                return;
        }
    }

    public va0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52776b = de0Var;
        this.f52777c = str;
        this.d = auth_sentcode;
        this.f52778e = bundle;
        this.f52779f = z10;
    }
}
