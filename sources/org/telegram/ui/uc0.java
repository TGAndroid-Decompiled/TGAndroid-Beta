package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class uc0 implements OnSuccessListener {
    public final int f43224a = 0;
    public final fg0 f43225b;
    public final String f43226c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f43227e;
    public final boolean f43228f;

    public uc0(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f43225b = fg0Var;
        this.f43227e = bundle;
        this.d = auth_sentcode;
        this.f43226c = str;
        this.f43228f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f43224a) {
            case 0:
                fg0.X(this.f43225b, this.f43227e, this.d, this.f43226c, this.f43228f, (IntegrityTokenResponse) obj);
                return;
            default:
                fg0.V(this.f43225b, this.f43226c, this.d, this.f43227e, this.f43228f, (y7.d) obj);
                return;
        }
    }

    public uc0(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f43225b = fg0Var;
        this.f43226c = str;
        this.d = auth_sentcode;
        this.f43227e = bundle;
        this.f43228f = z10;
    }
}
