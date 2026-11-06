package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f50344a = 0;
    public final ce0 f50345b;
    public final String f50346c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f50347e;
    public final boolean f50348f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f50345b = ce0Var;
        this.f50347e = bundle;
        this.d = auth_sentcode;
        this.f50346c = str;
        this.f50348f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f50344a) {
            case 0:
                ce0.a0(this.f50345b, this.f50347e, this.d, this.f50346c, this.f50348f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f50345b, this.f50346c, this.d, this.f50347e, this.f50348f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f50345b = ce0Var;
        this.f50346c = str;
        this.d = auth_sentcode;
        this.f50347e = bundle;
        this.f50348f = z9;
    }
}
