package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xb0 implements Utilities.Callback2 {
    public final int f43885a;
    public final fc0 f43886b;
    public final String f43887c;

    public xb0(fc0 fc0Var, String str, int i10) {
        this.f43885a = i10;
        this.f43886b = fc0Var;
        this.f43887c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43885a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fc0 fc0Var = this.f43886b;
                fc0Var.c();
                if (passkeys != null) {
                    fc0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f43887c)) {
                        fc0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                String str = (String) obj2;
                fc0 fc0Var2 = this.f43886b;
                fc0Var2.c();
                if (a2Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.zc.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.f2.B(U.getContext(), fc0Var2.f37715b, a2Var, null, U.getResourceProvider(), null, new ac0(fc0Var2, this.f43887c, 1));
                    return;
                }
                return;
        }
    }
}
