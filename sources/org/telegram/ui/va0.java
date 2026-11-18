package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class va0 implements OnSuccessListener {
    public final int f52729a = 0;
    public final ee0 f52730b;
    public final String f52731c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f52732e;
    public final boolean f52733f;

    public va0(ee0 ee0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f52730b = ee0Var;
        this.f52732e = bundle;
        this.d = auth_sentcode;
        this.f52731c = str;
        this.f52733f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f52729a) {
            case 0:
                ee0.a0(this.f52730b, this.f52732e, this.d, this.f52731c, this.f52733f, (IntegrityTokenResponse) obj);
                return;
            default:
                ee0.c0(this.f52730b, this.f52731c, this.d, this.f52732e, this.f52733f, (p8.d) obj);
                return;
        }
    }

    public va0(ee0 ee0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f52730b = ee0Var;
        this.f52731c = str;
        this.d = auth_sentcode;
        this.f52732e = bundle;
        this.f52733f = z10;
    }
}
