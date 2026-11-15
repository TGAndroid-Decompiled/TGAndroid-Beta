package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f51891a = 0;
    public final ce0 f51892b;
    public final String f51893c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f51894e;
    public final boolean f51895f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f51892b = ce0Var;
        this.f51894e = bundle;
        this.d = auth_sentcode;
        this.f51893c = str;
        this.f51895f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f51891a) {
            case 0:
                ce0.a0(this.f51892b, this.f51894e, this.d, this.f51893c, this.f51895f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f51892b, this.f51893c, this.d, this.f51894e, this.f51895f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f51892b = ce0Var;
        this.f51893c = str;
        this.d = auth_sentcode;
        this.f51894e = bundle;
        this.f51895f = z10;
    }
}
