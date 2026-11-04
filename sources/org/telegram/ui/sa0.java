package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sa0 implements RequestDelegate {
    public final int f49457a;
    public final xd0 f49458b;
    public final TLRPC.auth_SentCode f49459c;
    public final Bundle d;
    public final boolean f49460e;

    public sa0(int i3, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, xd0 xd0Var, boolean z10) {
        this.f49457a = i3;
        this.f49458b = xd0Var;
        this.f49459c = auth_sentcode;
        this.d = bundle;
        this.f49460e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49457a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final xd0 xd0Var = this.f49458b;
                final TLRPC.auth_SentCode auth_sentcode = this.f49459c;
                final Bundle bundle = this.d;
                if (z10) {
                    xd0Var.t1(false, true);
                    xd0Var.f51967q0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f49460e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    xd0Var.p1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    xd0Var.p1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final xd0 xd0Var2 = this.f49458b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f49459c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    xd0Var2.t1(false, true);
                    xd0Var2.f51967q0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f49460e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    xd0Var2.p1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    xd0Var2.p1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                xd0Var2.B1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
