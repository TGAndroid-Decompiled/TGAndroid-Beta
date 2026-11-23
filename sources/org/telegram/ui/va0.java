package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class va0 implements OnSuccessListener {
    public final int f52754a = 0;
    public final de0 f52755b;
    public final String f52756c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52757e;
    public final boolean f52758f;

    public va0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52755b = de0Var;
        this.f52757e = bundle;
        this.d = auth_sentcode;
        this.f52756c = str;
        this.f52758f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52754a) {
            case 0:
                de0.a0(this.f52755b, this.f52757e, this.d, this.f52756c, this.f52758f, (IntegrityTokenResponse) obj);
                return;
            default:
                de0.c0(this.f52755b, this.f52756c, this.d, this.f52757e, this.f52758f, (p8.d) obj);
                return;
        }
    }

    public va0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52755b = de0Var;
        this.f52756c = str;
        this.d = auth_sentcode;
        this.f52757e = bundle;
        this.f52758f = z10;
    }
}
