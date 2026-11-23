package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f52607a = 0;
    public final de0 f52608b;
    public final String f52609c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52610e;
    public final boolean f52611f;

    public ua0(de0 de0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52608b = de0Var;
        this.f52610e = bundle;
        this.d = auth_sentcode;
        this.f52609c = str;
        this.f52611f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52607a) {
            case 0:
                de0.a0(this.f52608b, this.f52610e, this.d, this.f52609c, this.f52611f, (IntegrityTokenResponse) obj);
                return;
            default:
                de0.c0(this.f52608b, this.f52609c, this.d, this.f52610e, this.f52611f, (p8.d) obj);
                return;
        }
    }

    public ua0(de0 de0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52608b = de0Var;
        this.f52609c = str;
        this.d = auth_sentcode;
        this.f52610e = bundle;
        this.f52611f = z10;
    }
}
