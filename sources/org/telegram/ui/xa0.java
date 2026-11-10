package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements OnSuccessListener {
    public final int f51660a = 0;
    public final fe0 f51661b;
    public final String f51662c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f51663e;
    public final boolean f51664f;

    public xa0(fe0 fe0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9) {
        this.f51661b = fe0Var;
        this.f51663e = bundle;
        this.d = auth_sentcode;
        this.f51662c = str;
        this.f51664f = z9;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f51660a) {
            case 0:
                fe0.a0(this.f51661b, this.f51663e, this.d, this.f51662c, this.f51664f, (IntegrityTokenResponse) obj);
                return;
            default:
                fe0.c0(this.f51661b, this.f51662c, this.d, this.f51663e, this.f51664f, (p8.d) obj);
                return;
        }
    }

    public xa0(fe0 fe0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9) {
        this.f51661b = fe0Var;
        this.f51662c = str;
        this.d = auth_sentcode;
        this.f51663e = bundle;
        this.f51664f = z9;
    }
}
