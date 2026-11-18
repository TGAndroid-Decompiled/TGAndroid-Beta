package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f52504a = 0;
    public final de0 f52505b;
    public final String f52506c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52507e;
    public final boolean f52508f;

    public ua0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52505b = de0Var;
        this.f52507e = bundle;
        this.d = auth_sentcode;
        this.f52506c = str;
        this.f52508f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52504a) {
            case 0:
                de0.a0(this.f52505b, this.f52507e, this.d, this.f52506c, this.f52508f, (IntegrityTokenResponse) obj);
                return;
            default:
                de0.c0(this.f52505b, this.f52506c, this.d, this.f52507e, this.f52508f, (p8.d) obj);
                return;
        }
    }

    public ua0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52505b = de0Var;
        this.f52506c = str;
        this.d = auth_sentcode;
        this.f52507e = bundle;
        this.f52508f = z10;
    }
}
