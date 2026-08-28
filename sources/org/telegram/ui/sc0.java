package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class sc0 implements OnSuccessListener {
    public final int f42659a = 0;
    public final fg0 f42660b;
    public final String f42661c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f42662e;
    public final boolean f42663f;

    public sc0(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f42660b = fg0Var;
        this.f42662e = bundle;
        this.d = auth_sentcode;
        this.f42661c = str;
        this.f42663f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f42659a) {
            case 0:
                fg0.W(this.f42660b, this.f42662e, this.d, this.f42661c, this.f42663f, (IntegrityTokenResponse) obj);
                return;
            default:
                fg0.U(this.f42660b, this.f42661c, this.d, this.f42662e, this.f42663f, (w7.d) obj);
                return;
        }
    }

    public sc0(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f42660b = fg0Var;
        this.f42661c = str;
        this.d = auth_sentcode;
        this.f42662e = bundle;
        this.f42663f = z10;
    }
}
