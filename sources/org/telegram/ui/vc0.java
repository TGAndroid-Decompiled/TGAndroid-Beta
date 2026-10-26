package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements RequestDelegate {
    public final int f44768a;
    public final gg0 f44769b;
    public final TLRPC.auth_SentCode f44770c;
    public final Bundle d;
    public final boolean e;

    public vc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, gg0 gg0Var, boolean z10) {
        this.f44768a = i10;
        this.f44769b = gg0Var;
        this.f44770c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44768a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final gg0 gg0Var = this.f44769b;
                final TLRPC.auth_SentCode auth_sentcode = this.f44770c;
                final Bundle bundle = this.d;
                if (z10) {
                    gg0Var.p1(false, true);
                    gg0Var.f39669o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    gg0Var.l1(bundle, auth_sentcode, z11);
                                    return;
                                default:
                                    gg0Var.l1(bundle, auth_sentcode, z11);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                gg0Var.x1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final gg0 gg0Var2 = this.f44769b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f44770c;
                final Bundle bundle2 = this.d;
                if (z12) {
                    gg0Var2.p1(false, true);
                    gg0Var2.f39669o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    gg0Var2.l1(bundle2, auth_sentcode2, z13);
                                    return;
                                default:
                                    gg0Var2.l1(bundle2, auth_sentcode2, z13);
                                    return;
                            }
                        }
                    });
                    return;
                }
                FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                gg0Var2.x1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
