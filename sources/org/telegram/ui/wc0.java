package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

public final class wc0 implements OnSuccessListener {

    public final int f43701a = 0;

    public final ig0 f43702b;

    public final String f43703c;
    public final TLRPC.auth_SentCode d;

    public final Bundle f43704e;

    public final boolean f43705f;

    public wc0(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f43702b = ig0Var;
        this.f43704e = bundle;
        this.d = auth_sentcode;
        this.f43703c = str;
        this.f43705f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f43701a) {
            case 0:
                ig0.X(this.f43702b, this.f43704e, this.d, this.f43703c, this.f43705f, (IntegrityTokenResponse) obj);
                break;
            default:
                ig0.V(this.f43702b, this.f43703c, this.d, this.f43704e, this.f43705f, (x7.d) obj);
                break;
        }
    }

    public wc0(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f43702b = ig0Var;
        this.f43703c = str;
        this.d = auth_sentcode;
        this.f43704e = bundle;
        this.f43705f = z10;
    }
}
