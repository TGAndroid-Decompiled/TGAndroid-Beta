package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements RequestDelegate {
    public final int f42148a;
    public final eg0 f42149b;
    public final TLRPC.auth_SentCode f42150c;
    public final Bundle d;
    public final boolean e;

    public vc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, eg0 eg0Var, boolean z10) {
        this.f42148a = i10;
        this.f42149b = eg0Var;
        this.f42150c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42148a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final eg0 eg0Var = this.f42149b;
                final TLRPC.auth_SentCode auth_sentcode = this.f42150c;
                final Bundle bundle = this.d;
                if (z10) {
                    eg0Var.k1(false, true);
                    eg0Var.f36507o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    eg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    eg0Var.g1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                eg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final eg0 eg0Var2 = this.f42149b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f42150c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    eg0Var2.k1(false, true);
                    eg0Var2.f36507o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    eg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    eg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                eg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
