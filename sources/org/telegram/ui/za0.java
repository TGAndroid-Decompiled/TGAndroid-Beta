package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class za0 implements RequestDelegate {
    public final int f52393a;
    public final fe0 f52394b;
    public final TLRPC.auth_SentCode f52395c;
    public final Bundle d;
    public final boolean f52396e;

    public za0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, fe0 fe0Var, boolean z9) {
        this.f52393a = i7;
        this.f52394b = fe0Var;
        this.f52395c = auth_sentcode;
        this.d = bundle;
        this.f52396e = z9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52393a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_boolTrue;
                final fe0 fe0Var = this.f52394b;
                final TLRPC.auth_SentCode auth_sentcode = this.f52395c;
                final Bundle bundle = this.d;
                if (z9) {
                    fe0Var.C1(false, true);
                    fe0Var.f45712p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z10 = this.f52396e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    fe0Var.y1(bundle, auth_sentcode, z10);
                                    return;
                                default:
                                    fe0Var.y1(bundle, auth_sentcode, z10);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                fe0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final fe0 fe0Var2 = this.f52394b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f52395c;
                final Bundle bundle2 = this.d;
                if (z11) {
                    fe0Var2.C1(false, true);
                    fe0Var2.f45712p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z12 = this.f52396e;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    fe0Var2.y1(bundle2, auth_sentcode2, z12);
                                    return;
                                default:
                                    fe0Var2.y1(bundle2, auth_sentcode2, z12);
                                    return;
                            }
                        }
                    });
                    return;
                }
                org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                fe0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
