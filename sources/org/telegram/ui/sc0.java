package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements OnSuccessListener {
    public final int f41054a = 0;
    public final eg0 f41055b;
    public final String f41056c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f41057f;

    public sc0(eg0 eg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f41055b = eg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f41056c = str;
        this.f41057f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f41054a) {
            case 0:
                eg0.X(this.f41055b, this.e, this.d, this.f41056c, this.f41057f, (IntegrityTokenResponse) obj);
                return;
            default:
                eg0.V(this.f41055b, this.f41056c, this.d, this.e, this.f41057f, (m8.d) obj);
                return;
        }
    }

    public sc0(eg0 eg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f41055b = eg0Var;
        this.f41056c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f41057f = z10;
    }
}
