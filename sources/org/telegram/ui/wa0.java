package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements RequestDelegate {
    public final int f52521a;
    public final ce0 f52522b;
    public final TLRPC.auth_SentCode f52523c;
    public final Bundle d;
    public final boolean f52524e;

    public wa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ce0 ce0Var, boolean z10) {
        this.f52521a = i7;
        this.f52522b = ce0Var;
        this.f52523c = auth_sentcode;
        this.d = bundle;
        this.f52524e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52521a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var = this.f52522b;
                final TLRPC.auth_SentCode auth_sentcode = this.f52523c;
                final Bundle bundle = this.d;
                if (z10) {
                    ce0Var.C1(false, true);
                    ce0Var.f46097r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f52524e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ce0Var.y1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ce0Var.y1(bundle, auth_sentcode, z11);
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
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var2 = this.f52522b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f52523c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ce0Var2.C1(false, true);
                    ce0Var2.f46097r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f52524e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z13);
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
