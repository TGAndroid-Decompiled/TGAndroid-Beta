package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements RequestDelegate {
    public final int f51040a;
    public final ce0 f51041b;
    public final TLRPC.auth_SentCode f51042c;
    public final Bundle d;
    public final boolean f51043e;

    public wa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ce0 ce0Var, boolean z9) {
        this.f51040a = i7;
        this.f51041b = ce0Var;
        this.f51042c = auth_sentcode;
        this.d = bundle;
        this.f51043e = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51040a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var = this.f51041b;
                final TLRPC.auth_SentCode auth_sentcode = this.f51042c;
                final Bundle bundle = this.d;
                if (z9) {
                    ce0Var.C1(false, true);
                    ce0Var.f44777p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.f51043e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ce0Var.y1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    ce0Var.y1(bundle, auth_sentcode, z10);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var2 = this.f51041b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f51042c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    ce0Var2.C1(false, true);
                    ce0Var2.f44777p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.f51043e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z12);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ce0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
