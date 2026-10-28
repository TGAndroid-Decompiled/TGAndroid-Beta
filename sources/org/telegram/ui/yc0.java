package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yc0 implements RequestDelegate {
    public final int f45957a;
    public final ig0 f45958b;
    public final TLRPC.auth_SentCode f45959c;
    public final Bundle d;
    public final boolean e;

    public yc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ig0 ig0Var, boolean z10) {
        this.f45957a = i10;
        this.f45958b = ig0Var;
        this.f45959c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45957a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var = this.f45958b;
                final TLRPC.auth_SentCode auth_sentcode = this.f45959c;
                final Bundle bundle = this.d;
                if (z10) {
                    ig0Var.p1(false, true);
                    ig0Var.f40159p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ig0Var.l1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ig0Var.l1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ig0Var.x1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var2 = this.f45958b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f45959c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ig0Var2.p1(false, true);
                    ig0Var2.f40159p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ig0Var2.l1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ig0Var2.l1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ig0Var2.x1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
