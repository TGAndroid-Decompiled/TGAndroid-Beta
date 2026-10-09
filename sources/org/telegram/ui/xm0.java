package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xm0 implements RequestDelegate {
    public final int f44066a;
    public final zm0 f44067b;

    public xm0(zm0 zm0Var, int i10) {
        this.f44066a = i10;
        this.f44067b = zm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f44066a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ym0(this.f44067b, tLObject, tL_error));
                return;
            case 1:
                final zm0 zm0Var = this.f44067b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                zm0 zm0Var2 = zm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                nn0 nn0Var = zm0Var2.f44699e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new xm0(zm0Var2, 4), 8);
                                    return;
                                }
                                if (nn0Var.f40296y == null) {
                                    nn0Var.f40296y = new TL_account.authorizationForm();
                                }
                                zm0Var2.a();
                                return;
                            default:
                                zm0 zm0Var3 = zm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) zm0Var3.f44699e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new xm0(zm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new of0(zm0Var3, zm0Var3.f44697b, zm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final zm0 zm0Var2 = this.f44067b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                zm0 zm0Var22 = zm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                nn0 nn0Var = zm0Var22.f44699e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new xm0(zm0Var22, 4), 8);
                                    return;
                                }
                                if (nn0Var.f40296y == null) {
                                    nn0Var.f40296y = new TL_account.authorizationForm();
                                }
                                zm0Var22.a();
                                return;
                            default:
                                zm0 zm0Var3 = zm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) zm0Var3.f44699e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new xm0(zm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new of0(zm0Var3, zm0Var3.f44697b, zm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ym0(this.f44067b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ym0(this.f44067b, tL_error, tLObject, 2));
                return;
        }
    }
}
