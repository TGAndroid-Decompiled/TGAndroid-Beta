package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f50366a = 0;
    public final ce0 f50367b;
    public final String f50368c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f50369e;
    public final boolean f50370f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f50367b = ce0Var;
        this.f50369e = bundle;
        this.d = auth_sentcode;
        this.f50368c = str;
        this.f50370f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f50366a) {
            case 0:
                ce0.a0(this.f50367b, this.f50369e, this.d, this.f50368c, this.f50370f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f50367b, this.f50368c, this.d, this.f50369e, this.f50370f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f50367b = ce0Var;
        this.f50368c = str;
        this.d = auth_sentcode;
        this.f50369e = bundle;
        this.f50370f = z9;
    }
}
