package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td0 implements RequestDelegate {
    public final int f40362a;
    public final bh0 f40363b;
    public final TLRPC.auth_SentCode f40364c;
    public final Bundle d;
    public final boolean e;

    public td0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, bh0 bh0Var, boolean z10) {
        this.f40362a = i10;
        this.f40363b = bh0Var;
        this.f40364c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40362a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final bh0 bh0Var = this.f40363b;
                final TLRPC.auth_SentCode auth_sentcode = this.f40364c;
                final Bundle bundle = this.d;
                if (z10) {
                    bh0Var.k1(false, true);
                    bh0Var.f34561o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    bh0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    bh0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                bh0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final bh0 bh0Var2 = this.f40363b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f40364c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    bh0Var2.k1(false, true);
                    bh0Var2.f34561o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    bh0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    bh0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                bh0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
