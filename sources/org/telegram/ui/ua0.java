package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ua0 implements OnSuccessListener {
    public final int f51890a = 0;
    public final ce0 f51891b;
    public final String f51892c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f51893e;
    public final boolean f51894f;

    public ua0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f51891b = ce0Var;
        this.f51893e = bundle;
        this.d = auth_sentcode;
        this.f51892c = str;
        this.f51894f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f51890a) {
            case 0:
                ce0.a0(this.f51891b, this.f51893e, this.d, this.f51892c, this.f51894f, (IntegrityTokenResponse) obj);
                return;
            default:
                ce0.c0(this.f51891b, this.f51892c, this.d, this.f51893e, this.f51894f, (p8.d) obj);
                return;
        }
    }

    public ua0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f51891b = ce0Var;
        this.f51892c = str;
        this.d = auth_sentcode;
        this.f51893e = bundle;
        this.f51894f = z10;
    }
}
