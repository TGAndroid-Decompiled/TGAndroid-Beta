package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements OnSuccessListener {
    public final int f51004a = 0;
    public final ee0 f51005b;
    public final String f51006c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f51007e;
    public final boolean f51008f;

    public wa0(ee0 ee0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f51005b = ee0Var;
        this.f51007e = bundle;
        this.d = auth_sentcode;
        this.f51006c = str;
        this.f51008f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f51004a) {
            case 0:
                ee0.a0(this.f51005b, this.f51007e, this.d, this.f51006c, this.f51008f, (IntegrityTokenResponse) obj);
                return;
            default:
                ee0.c0(this.f51005b, this.f51006c, this.d, this.f51007e, this.f51008f, (p8.d) obj);
                return;
        }
    }

    public wa0(ee0 ee0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f51005b = ee0Var;
        this.f51006c = str;
        this.d = auth_sentcode;
        this.f51007e = bundle;
        this.f51008f = z9;
    }
}
