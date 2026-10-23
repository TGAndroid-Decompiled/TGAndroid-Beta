package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements OnSuccessListener {
    public final int f42727a = 0;
    public final ig0 f42728b;
    public final String f42729c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f42730f;

    public vc0(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f42728b = ig0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f42729c = str;
        this.f42730f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f42727a) {
            case 0:
                ig0.X(this.f42728b, this.e, this.d, this.f42729c, this.f42730f, (IntegrityTokenResponse) obj);
                return;
            default:
                ig0.V(this.f42728b, this.f42729c, this.d, this.e, this.f42730f, (m8.d) obj);
                return;
        }
    }

    public vc0(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f42728b = ig0Var;
        this.f42729c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f42730f = z10;
    }
}
