package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wk0 implements RequestDelegate {
    public final int f43327a;
    public final yk0 f43328b;

    public wk0(yk0 yk0Var, int i10) {
        this.f43327a = i10;
        this.f43328b = yk0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43327a) {
            case 0:
                org.telegram.messenger.i0.g3(new xk0(this.f43328b, tLObject, tL_error));
                return;
            case 1:
                final yk0 yk0Var = this.f43328b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                yk0 yk0Var2 = yk0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ll0 ll0Var = yk0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wk0(yk0Var2, 4), 8);
                                    return;
                                }
                                if (ll0Var.D == null) {
                                    ll0Var.D = new TL_account.authorizationForm();
                                }
                                yk0Var2.a();
                                return;
                            default:
                                yk0 yk0Var3 = yk0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) yk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new wk0(yk0Var3, 3), 8);
                                    return;
                                }
                                Utilities.e.c(new qd0(yk0Var3, yk0Var3.f43859b, yk0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final yk0 yk0Var2 = this.f43328b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                yk0 yk0Var22 = yk0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ll0 ll0Var = yk0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wk0(yk0Var22, 4), 8);
                                    return;
                                }
                                if (ll0Var.D == null) {
                                    ll0Var.D = new TL_account.authorizationForm();
                                }
                                yk0Var22.a();
                                return;
                            default:
                                yk0 yk0Var3 = yk0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) yk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new wk0(yk0Var3, 3), 8);
                                    return;
                                }
                                Utilities.e.c(new qd0(yk0Var3, yk0Var3.f43859b, yk0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.i0.g3(new xk0(this.f43328b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new xk0(this.f43328b, tL_error, tLObject, 2));
                return;
        }
    }
}
