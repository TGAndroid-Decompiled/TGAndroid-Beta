package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qm0 implements RequestDelegate {
    public final int f36944a;
    public final sm0 f36945b;

    public qm0(sm0 sm0Var, int i10) {
        this.f36944a = i10;
        this.f36945b = sm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36944a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rm0(this.f36945b, tLObject, tL_error));
                return;
            case 1:
                final sm0 sm0Var = this.f36945b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                sm0 sm0Var2 = sm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                gn0 gn0Var = sm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qm0(sm0Var2, 4), 8);
                                    return;
                                }
                                if (gn0Var.f34023y == null) {
                                    gn0Var.f34023y = new TL_account.authorizationForm();
                                }
                                sm0Var2.a();
                                return;
                            default:
                                sm0 sm0Var3 = sm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) sm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new qm0(sm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new jf0(sm0Var3, sm0Var3.f37827b, sm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final sm0 sm0Var2 = this.f36945b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                sm0 sm0Var22 = sm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                gn0 gn0Var = sm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qm0(sm0Var22, 4), 8);
                                    return;
                                }
                                if (gn0Var.f34023y == null) {
                                    gn0Var.f34023y = new TL_account.authorizationForm();
                                }
                                sm0Var22.a();
                                return;
                            default:
                                sm0 sm0Var3 = sm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) sm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new qm0(sm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new jf0(sm0Var3, sm0Var3.f37827b, sm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new rm0(this.f36945b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rm0(this.f36945b, tL_error, tLObject, 2));
                return;
        }
    }
}
