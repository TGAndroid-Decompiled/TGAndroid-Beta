package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f43524a;
    public final hg0 f43525b;
    public final TLRPC.auth_SentCode f43526c;
    public final Bundle d;
    public final boolean e;

    public xc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, hg0 hg0Var, boolean z10) {
        this.f43524a = i10;
        this.f43525b = hg0Var;
        this.f43526c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43524a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final hg0 hg0Var = this.f43525b;
                final TLRPC.auth_SentCode auth_sentcode = this.f43526c;
                final Bundle bundle = this.d;
                if (z10) {
                    hg0Var.o1(false, true);
                    hg0Var.f37851o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    hg0Var.k1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    hg0Var.k1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                hg0Var.w1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final hg0 hg0Var2 = this.f43525b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f43526c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    hg0Var2.o1(false, true);
                    hg0Var2.f37851o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    hg0Var2.k1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    hg0Var2.k1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                hg0Var2.w1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
