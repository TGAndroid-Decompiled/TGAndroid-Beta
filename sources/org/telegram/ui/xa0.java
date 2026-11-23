package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements RequestDelegate {
    public final int f53724a;
    public final de0 f53725b;
    public final TLRPC.auth_SentCode f53726c;
    public final Bundle d;
    public final boolean f53727e;

    public xa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, de0 de0Var, boolean z10) {
        this.f53724a = i7;
        this.f53725b = de0Var;
        this.f53726c = auth_sentcode;
        this.d = bundle;
        this.f53727e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53724a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final de0 de0Var = this.f53725b;
                final TLRPC.auth_SentCode auth_sentcode = this.f53726c;
                final Bundle bundle = this.d;
                if (z10) {
                    de0Var.C1(false, true);
                    de0Var.f46909r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f53727e;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    de0Var.y1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    de0Var.y1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                de0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final de0 de0Var2 = this.f53725b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f53726c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    de0Var2.C1(false, true);
                    de0Var2.f46909r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f53727e;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    de0Var2.y1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    de0Var2.y1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                de0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
