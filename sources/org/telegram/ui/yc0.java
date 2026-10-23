package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yc0 implements RequestDelegate {
    public final int f43770a;
    public final ig0 f43771b;
    public final TLRPC.auth_SentCode f43772c;
    public final Bundle d;
    public final boolean e;

    public yc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ig0 ig0Var, boolean z10) {
        this.f43770a = i10;
        this.f43771b = ig0Var;
        this.f43772c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43770a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var = this.f43771b;
                final TLRPC.auth_SentCode auth_sentcode = this.f43772c;
                final Bundle bundle = this.d;
                if (z10) {
                    ig0Var.o1(false, true);
                    ig0Var.f38210o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ig0Var.k1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    ig0Var.k1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ig0Var.w1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var2 = this.f43771b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f43772c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    ig0Var2.o1(false, true);
                    ig0Var2.f38210o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    ig0Var2.k1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    ig0Var2.k1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                ig0Var2.w1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
