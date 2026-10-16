package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rd0 implements RequestDelegate {
    public final int f39478a;
    public final ah0 f39479b;
    public final TLRPC.auth_SentCode f39480c;
    public final Bundle d;
    public final boolean e;

    public rd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ah0 ah0Var, boolean z10) {
        this.f39478a = i10;
        this.f39479b = ah0Var;
        this.f39480c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39478a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ah0 ah0Var = this.f39479b;
                final TLRPC.auth_SentCode auth_sentcode = this.f39480c;
                final Bundle bundle = this.d;
                if (z10) {
                    ah0Var.k1(false, true);
                    ah0Var.f33923o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ah0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ah0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ah0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ah0 ah0Var2 = this.f39479b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f39480c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ah0Var2.k1(false, true);
                    ah0Var2.f33923o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ah0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ah0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ah0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
