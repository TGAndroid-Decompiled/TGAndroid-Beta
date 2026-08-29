package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f44546a;
    public final fg0 f44547b;
    public final TLRPC.auth_SentCode f44548c;
    public final Bundle d;
    public final boolean f44549e;

    public xc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, fg0 fg0Var, boolean z10) {
        this.f44546a = i10;
        this.f44547b = fg0Var;
        this.f44548c = auth_sentcode;
        this.d = bundle;
        this.f44549e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44546a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final fg0 fg0Var = this.f44547b;
                final TLRPC.auth_SentCode auth_sentcode = this.f44548c;
                final Bundle bundle = this.d;
                if (z10) {
                    fg0Var.k1(false, true);
                    fg0Var.f38166k0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.f44549e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    fg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    fg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                fg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final fg0 fg0Var2 = this.f44547b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f44548c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    fg0Var2.k1(false, true);
                    fg0Var2.f38166k0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.f44549e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    fg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    fg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                fg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
