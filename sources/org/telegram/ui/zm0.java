package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zm0 implements RequestDelegate {
    public final int f43464a;
    public final bn0 f43465b;

    public zm0(bn0 bn0Var, int i10) {
        this.f43464a = i10;
        this.f43465b = bn0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43464a) {
            case 0:
                AndroidUtilities.runOnUIThread(new an0(this.f43465b, tLObject, tL_error));
                return;
            case 1:
                final bn0 bn0Var = this.f43465b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                bn0 bn0Var2 = bn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                pn0 pn0Var = bn0Var2.f34849e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zm0(bn0Var2, 4), 8);
                                    return;
                                }
                                if (pn0Var.f39604y == null) {
                                    pn0Var.f39604y = new TL_account.authorizationForm();
                                }
                                bn0Var2.a();
                                return;
                            default:
                                bn0 bn0Var3 = bn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) bn0Var3.f34849e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new zm0(bn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new pf0(bn0Var3, bn0Var3.f34847b, bn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final bn0 bn0Var2 = this.f43465b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                bn0 bn0Var22 = bn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                pn0 pn0Var = bn0Var22.f34849e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zm0(bn0Var22, 4), 8);
                                    return;
                                }
                                if (pn0Var.f39604y == null) {
                                    pn0Var.f39604y = new TL_account.authorizationForm();
                                }
                                bn0Var22.a();
                                return;
                            default:
                                bn0 bn0Var3 = bn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) bn0Var3.f34849e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new zm0(bn0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new pf0(bn0Var3, bn0Var3.f34847b, bn0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new an0(this.f43465b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new an0(this.f43465b, tL_error, tLObject, 2));
                return;
        }
    }
}
