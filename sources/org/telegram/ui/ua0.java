package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f50281a = 0;
    public final ce0 f50282b;
    public final String f50283c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f50284e;
    public final boolean f50285f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f50282b = ce0Var;
        this.f50284e = bundle;
        this.d = auth_sentcode;
        this.f50283c = str;
        this.f50285f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f50281a) {
            case 0:
                ce0.a0(this.f50282b, this.f50284e, this.d, this.f50283c, this.f50285f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f50282b, this.f50283c, this.d, this.f50284e, this.f50285f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f50282b = ce0Var;
        this.f50283c = str;
        this.d = auth_sentcode;
        this.f50284e = bundle;
        this.f50285f = z9;
    }
}
