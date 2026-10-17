package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements OnSuccessListener {
    public final int f41071a = 0;
    public final fg0 f41072b;
    public final String f41073c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f41074f;

    public sc0(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f41072b = fg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f41073c = str;
        this.f41074f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f41071a) {
            case 0:
                fg0.X(this.f41072b, this.e, this.d, this.f41073c, this.f41074f, (IntegrityTokenResponse) obj);
                return;
            default:
                fg0.V(this.f41072b, this.f41073c, this.d, this.e, this.f41074f, (m8.d) obj);
                return;
        }
    }

    public sc0(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f41072b = fg0Var;
        this.f41073c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f41074f = z10;
    }
}
