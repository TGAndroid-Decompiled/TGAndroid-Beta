package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vb0 implements Utilities.Callback2 {
    public final int f43004a;
    public final dc0 f43005b;
    public final String f43006c;

    public vb0(dc0 dc0Var, String str, int i10) {
        this.f43004a = i10;
        this.f43005b = dc0Var;
        this.f43006c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43004a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dc0 dc0Var = this.f43005b;
                dc0Var.c();
                if (passkeys != null) {
                    dc0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f43006c)) {
                        dc0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str = (String) obj2;
                dc0 dc0Var2 = this.f43005b;
                dc0Var2.c();
                if (a2Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.ad.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.f2.B(U.getContext(), dc0Var2.f37010b, a2Var, null, U.getResourceProvider(), null, new yb0(dc0Var2, this.f43006c, 1));
                    return;
                }
                return;
        }
    }
}
