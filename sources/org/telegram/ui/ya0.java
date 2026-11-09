package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements RequestDelegate {
    public final int f52064a;
    public final ee0 f52065b;
    public final TLRPC.auth_SentCode f52066c;
    public final Bundle d;
    public final boolean f52067e;

    public ya0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ee0 ee0Var, boolean z9) {
        this.f52064a = i7;
        this.f52065b = ee0Var;
        this.f52066c = auth_sentcode;
        this.d = bundle;
        this.f52067e = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52064a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var = this.f52065b;
                final TLRPC.auth_SentCode auth_sentcode = this.f52066c;
                final Bundle bundle = this.d;
                if (z9) {
                    ee0Var.C1(false, true);
                    ee0Var.f45388p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.f52067e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ee0Var.y1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    ee0Var.y1(bundle, auth_sentcode, z10);
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
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var2 = this.f52065b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f52066c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    ee0Var2.C1(false, true);
                    ee0Var2.f45388p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.f52067e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z12);
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
