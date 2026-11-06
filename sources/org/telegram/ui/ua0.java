package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f50365a = 0;
    public final ce0 f50366b;
    public final String f50367c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f50368e;
    public final boolean f50369f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f50366b = ce0Var;
        this.f50368e = bundle;
        this.d = auth_sentcode;
        this.f50367c = str;
        this.f50369f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f50365a) {
            case 0:
                ce0.a0(this.f50366b, this.f50368e, this.d, this.f50367c, this.f50369f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f50366b, this.f50367c, this.d, this.f50368e, this.f50369f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f50366b = ce0Var;
        this.f50367c = str;
        this.d = auth_sentcode;
        this.f50368e = bundle;
        this.f50369f = z9;
    }
}
