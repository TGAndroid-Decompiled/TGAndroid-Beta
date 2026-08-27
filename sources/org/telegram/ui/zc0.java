package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class zc0 implements RequestDelegate {

    public final int f45133a;

    public final ig0 f45134b;

    public final TLRPC.auth_SentCode f45135c;
    public final Bundle d;

    public final boolean f45136e;

    public zc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ig0 ig0Var, boolean z10) {
        this.f45133a = i10;
        this.f45134b = ig0Var;
        this.f45135c = auth_sentcode;
        this.d = bundle;
        this.f45136e = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45133a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var = this.f45134b;
                final TLRPC.auth_SentCode auth_sentcode = this.f45135c;
                final Bundle bundle = this.d;
                if (!z10) {
                    FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ig0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                } else {
                    ig0Var.k1(false, true);
                    ig0Var.f39094k0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z11 = this.f45136e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ig0Var.g1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    ig0Var.g1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var2 = this.f45134b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.f45135c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ig0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                } else {
                    ig0Var2.k1(false, true);
                    ig0Var2.f39094k0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i11 = 0;
                    final boolean z13 = this.f45136e;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ig0Var2.g1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    ig0Var2.g1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                }
                break;
        }
    }
}
