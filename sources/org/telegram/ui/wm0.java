package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wm0 implements RequestDelegate {
    public final int f43829a;
    public final ym0 f43830b;

    public wm0(ym0 ym0Var, int i10) {
        this.f43829a = i10;
        this.f43830b = ym0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43829a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xm0(this.f43830b, tLObject, tL_error));
                return;
            case 1:
                final ym0 ym0Var = this.f43830b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                ym0 ym0Var2 = ym0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                mn0 mn0Var = ym0Var2.f44459e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) mn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wm0(ym0Var2, 4), 8);
                                    return;
                                }
                                if (mn0Var.f40038y == null) {
                                    mn0Var.f40038y = new TL_account.authorizationForm();
                                }
                                ym0Var2.a();
                                return;
                            default:
                                ym0 ym0Var3 = ym0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) ym0Var3.f44459e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new wm0(ym0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new nf0(ym0Var3, ym0Var3.f44457b, ym0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final ym0 ym0Var2 = this.f43830b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                ym0 ym0Var22 = ym0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                mn0 mn0Var = ym0Var22.f44459e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) mn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new wm0(ym0Var22, 4), 8);
                                    return;
                                }
                                if (mn0Var.f40038y == null) {
                                    mn0Var.f40038y = new TL_account.authorizationForm();
                                }
                                ym0Var22.a();
                                return;
                            default:
                                ym0 ym0Var3 = ym0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) ym0Var3.f44459e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new wm0(ym0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new nf0(ym0Var3, ym0Var3.f44457b, ym0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xm0(this.f43830b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xm0(this.f43830b, tL_error, tLObject, 2));
                return;
        }
    }
}
