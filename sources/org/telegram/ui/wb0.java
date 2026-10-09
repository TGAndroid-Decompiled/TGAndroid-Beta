package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wb0 implements Utilities.Callback2 {
    public final int f43181a;
    public final ec0 f43182b;
    public final String f43183c;

    public wb0(ec0 ec0Var, String str, int i10) {
        this.f43181a = i10;
        this.f43182b = ec0Var;
        this.f43183c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f43181a) {
            case 0:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ec0 ec0Var = this.f43182b;
                ec0Var.c();
                if (passkeys != null) {
                    ec0Var.u(new PasskeysActivity(passkeys.passkeys), false);
                    if ("create".equalsIgnoreCase(this.f43183c)) {
                        ec0Var.x("addPasskeyRow");
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                String str = (String) obj2;
                ec0 ec0Var2 = this.f43182b;
                ec0Var2.c();
                if (y1Var == null) {
                    if (str == null) {
                        str = LocaleController.getString(R.string.WalletTonConnectSessionResponseEmpty);
                    }
                    org.telegram.ui.Components.ad.b0(str);
                    return;
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null && U.getContext() != null) {
                    org.telegram.ui.Wallet.d2.B(U.getContext(), ec0Var2.f37222b, y1Var, null, U.getResourceProvider(), null, new zb0(ec0Var2, this.f43183c, 1));
                    return;
                }
                return;
        }
    }
}
