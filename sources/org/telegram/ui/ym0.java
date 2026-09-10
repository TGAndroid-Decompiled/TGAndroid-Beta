package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ym0 implements RequestDelegate {
    public final int f39031a;
    public final an0 f39032b;

    public ym0(an0 an0Var, int i10) {
        this.f39031a = i10;
        this.f39032b = an0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39031a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zm0(this.f39032b, tLObject, tL_error));
                return;
            case 1:
                final an0 an0Var = this.f39032b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                an0 an0Var2 = an0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                on0 on0Var = an0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ym0(an0Var2, 4), 8);
                                    return;
                                }
                                if (on0Var.f35572y == null) {
                                    on0Var.f35572y = new TL_account.authorizationForm();
                                }
                                an0Var2.a();
                                return;
                            default:
                                an0 an0Var3 = an0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.p2) an0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new ym0(an0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new pf0(an0Var3, an0Var3.f31042b, an0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final an0 an0Var2 = this.f39032b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                an0 an0Var22 = an0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                on0 on0Var = an0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ym0(an0Var22, 4), 8);
                                    return;
                                }
                                if (on0Var.f35572y == null) {
                                    on0Var.f35572y = new TL_account.authorizationForm();
                                }
                                an0Var22.a();
                                return;
                            default:
                                an0 an0Var3 = an0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.p2) an0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new ym0(an0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new pf0(an0Var3, an0Var3.f31042b, an0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zm0(this.f39032b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zm0(this.f39032b, tL_error, tLObject, 2));
                return;
        }
    }
}
