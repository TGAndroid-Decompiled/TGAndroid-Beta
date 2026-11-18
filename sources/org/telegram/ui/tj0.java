package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tj0 implements RequestDelegate {
    public final int f52294a;
    public final vj0 f52295b;

    public tj0(vj0 vj0Var, int i7) {
        this.f52294a = i7;
        this.f52295b = vj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52294a) {
            case 0:
                org.telegram.messenger.g0.g3(new uj0(this.f52295b, tLObject, tL_error));
                return;
            case 1:
                final vj0 vj0Var = this.f52295b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                vj0 vj0Var2 = vj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                hk0 hk0Var = vj0Var2.f52795e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new tj0(vj0Var2, 4), 8);
                                    return;
                                }
                                if (hk0Var.E == null) {
                                    hk0Var.E = new TL_account.authorizationForm();
                                }
                                vj0Var2.a();
                                return;
                            default:
                                vj0 vj0Var3 = vj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.h2) vj0Var3.f52795e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new tj0(vj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22779e.c(new mc0(vj0Var3, vj0Var3.f52793b, vj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final vj0 vj0Var2 = this.f52295b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                vj0 vj0Var22 = vj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                hk0 hk0Var = vj0Var22.f52795e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new tj0(vj0Var22, 4), 8);
                                    return;
                                }
                                if (hk0Var.E == null) {
                                    hk0Var.E = new TL_account.authorizationForm();
                                }
                                vj0Var22.a();
                                return;
                            default:
                                vj0 vj0Var3 = vj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.h2) vj0Var3.f52795e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new tj0(vj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22779e.c(new mc0(vj0Var3, vj0Var3.f52793b, vj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.g3(new uj0(this.f52295b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new uj0(this.f52295b, tL_error, tLObject, 2));
                return;
        }
    }
}
