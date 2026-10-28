package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class wc0 implements OnSuccessListener {
    public final int f44629a = 0;
    public final ig0 f44630b;
    public final String f44631c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f44632f;

    public wc0(ig0 ig0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f44630b = ig0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f44631c = str;
        this.f44632f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f44629a) {
            case 0:
                ig0.W(this.f44630b, this.e, this.d, this.f44631c, this.f44632f, (IntegrityTokenResponse) obj);
                return;
            default:
                ig0.Y(this.f44630b, this.f44631c, this.d, this.e, this.f44632f, (n8.d) obj);
                return;
        }
    }

    public wc0(ig0 ig0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f44630b = ig0Var;
        this.f44631c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f44632f = z10;
    }
}
