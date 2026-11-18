package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements RequestDelegate {
    public final int f53757a;
    public final ee0 f53758b;
    public final TLRPC.auth_SentCode f53759c;
    public final Bundle d;
    public final boolean f53760e;

    public xa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ee0 ee0Var, boolean z10) {
        this.f53757a = i7;
        this.f53758b = ee0Var;
        this.f53759c = auth_sentcode;
        this.d = bundle;
        this.f53760e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53757a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var = this.f53758b;
                final TLRPC.auth_SentCode auth_sentcode = this.f53759c;
                final Bundle bundle = this.d;
                if (z10) {
                    ee0Var.C1(false, true);
                    ee0Var.f47200r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f53760e;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ee0Var.y1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ee0Var.y1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ee0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var2 = this.f53758b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f53759c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ee0Var2.C1(false, true);
                    ee0Var2.f47200r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f53760e;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ee0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
