package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sm0 implements RequestDelegate {
    public final int f43537a;
    public final um0 f43538b;

    public sm0(um0 um0Var, int i10) {
        this.f43537a = i10;
        this.f43538b = um0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43537a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tm0(this.f43538b, tLObject, tL_error));
                return;
            case 1:
                final um0 um0Var = this.f43538b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                um0 um0Var2 = um0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                in0 in0Var = um0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new sm0(um0Var2, 4), 8);
                                    return;
                                }
                                if (in0Var.f40324y == null) {
                                    in0Var.f40324y = new TL_account.authorizationForm();
                                }
                                um0Var2.a();
                                return;
                            default:
                                um0 um0Var3 = um0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.r2) um0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new sm0(um0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new oe0(um0Var3, um0Var3.f44166b, um0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final um0 um0Var2 = this.f43538b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                um0 um0Var22 = um0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                in0 in0Var = um0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new sm0(um0Var22, 4), 8);
                                    return;
                                }
                                if (in0Var.f40324y == null) {
                                    in0Var.f40324y = new TL_account.authorizationForm();
                                }
                                um0Var22.a();
                                return;
                            default:
                                um0 um0Var3 = um0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.r2) um0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new sm0(um0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new oe0(um0Var3, um0Var3.f44166b, um0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new tm0(this.f43538b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tm0(this.f43538b, tL_error, tLObject, 2));
                return;
        }
    }
}
