package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements OnSuccessListener {
    public final int f43468a = 0;
    public final gg0 f43469b;
    public final String f43470c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f43471f;

    public sc0(gg0 gg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f43469b = gg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f43470c = str;
        this.f43471f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f43468a) {
            case 0:
                gg0.Y(this.f43469b, this.e, this.d, this.f43470c, this.f43471f, (IntegrityTokenResponse) obj);
                return;
            default:
                gg0.W(this.f43469b, this.f43470c, this.d, this.e, this.f43471f, (n8.d) obj);
                return;
        }
    }

    public sc0(gg0 gg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f43469b = gg0Var;
        this.f43470c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f43471f = z10;
    }
}
