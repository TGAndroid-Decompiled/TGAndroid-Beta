package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rj0 implements RequestDelegate {
    public final int f51735a;
    public final tj0 f51736b;

    public rj0(tj0 tj0Var, int i7) {
        this.f51735a = i7;
        this.f51736b = tj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51735a) {
            case 0:
                org.telegram.messenger.g0.g3(new sj0(this.f51736b, tLObject, tL_error));
                return;
            case 1:
                final tj0 tj0Var = this.f51736b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                tj0 tj0Var2 = tj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fk0 fk0Var = tj0Var2.f52419e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new rj0(tj0Var2, 4), 8);
                                    return;
                                }
                                if (fk0Var.E == null) {
                                    fk0Var.E = new TL_account.authorizationForm();
                                }
                                tj0Var2.a();
                                return;
                            default:
                                tj0 tj0Var3 = tj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.g2) tj0Var3.f52419e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new rj0(tj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22877e.c(new lc0(tj0Var3, tj0Var3.f52417b, tj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final tj0 tj0Var2 = this.f51736b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                tj0 tj0Var22 = tj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fk0 fk0Var = tj0Var22.f52419e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new rj0(tj0Var22, 4), 8);
                                    return;
                                }
                                if (fk0Var.E == null) {
                                    fk0Var.E = new TL_account.authorizationForm();
                                }
                                tj0Var22.a();
                                return;
                            default:
                                tj0 tj0Var3 = tj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.g2) tj0Var3.f52419e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new rj0(tj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f22877e.c(new lc0(tj0Var3, tj0Var3.f52417b, tj0Var3.d, 14));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.g3(new sj0(this.f51736b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new sj0(this.f51736b, tL_error, tLObject, 2));
                return;
        }
    }
}
