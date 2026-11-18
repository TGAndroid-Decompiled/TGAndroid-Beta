package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements RequestDelegate {
    public final int f53040a;
    public final de0 f53041b;
    public final TLRPC.auth_SentCode f53042c;
    public final Bundle d;
    public final boolean f53043e;

    public wa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, de0 de0Var, boolean z10) {
        this.f53040a = i7;
        this.f53041b = de0Var;
        this.f53042c = auth_sentcode;
        this.d = bundle;
        this.f53043e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53040a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final de0 de0Var = this.f53041b;
                final TLRPC.auth_SentCode auth_sentcode = this.f53042c;
                final Bundle bundle = this.d;
                if (z10) {
                    de0Var.C1(false, true);
                    de0Var.f46956r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f53043e;
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
                final de0 de0Var2 = this.f53041b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f53042c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    de0Var2.C1(false, true);
                    de0Var2.f46956r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f53043e;
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
