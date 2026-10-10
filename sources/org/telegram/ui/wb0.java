package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wb0 implements Utilities.Callback2 {
    public final int f43225a;
    public final ec0 f43226b;
    public final String f43227c;

    public wb0(ec0 ec0Var, String str, int i10) {
        this.f43225a = i10;
        this.f43226b = ec0Var;
        this.f43227c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43225a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ec0 ec0Var = this.f43226b;
                ec0Var.c();
                if (passkeys != null) {
                    ec0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f43227c)) {
                        ec0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                String str = (String) obj2;
                ec0 ec0Var2 = this.f43226b;
                ec0Var2.c();
                if (z1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.ad.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.e2.B(U.getContext(), ec0Var2.f37266b, z1Var, null, U.getResourceProvider(), null, new zb0(ec0Var2, this.f43227c, 1));
                    return;
                }
                return;
        }
    }
}
