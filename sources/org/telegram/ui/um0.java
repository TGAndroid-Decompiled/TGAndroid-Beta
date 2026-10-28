package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class um0 implements RequestDelegate {
    public final int f44054a;
    public final wm0 f44055b;

    public um0(wm0 wm0Var, int i10) {
        this.f44054a = i10;
        this.f44055b = wm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f44054a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vm0(this.f44055b, tLObject, tL_error));
                return;
            case 1:
                final wm0 wm0Var = this.f44055b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                wm0 wm0Var2 = wm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                kn0 kn0Var = wm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new um0(wm0Var2, 4), 8);
                                    return;
                                }
                                if (kn0Var.f40890y == null) {
                                    kn0Var.f40890y = new TL_account.authorizationForm();
                                }
                                wm0Var2.a();
                                return;
                            default:
                                wm0 wm0Var3 = wm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.r2) wm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new um0(wm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ne0(wm0Var3, wm0Var3.f45033b, wm0Var3.d, 16));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final wm0 wm0Var2 = this.f44055b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                wm0 wm0Var22 = wm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                kn0 kn0Var = wm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new um0(wm0Var22, 4), 8);
                                    return;
                                }
                                if (kn0Var.f40890y == null) {
                                    kn0Var.f40890y = new TL_account.authorizationForm();
                                }
                                wm0Var22.a();
                                return;
                            default:
                                wm0 wm0Var3 = wm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.r2) wm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new um0(wm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new ne0(wm0Var3, wm0Var3.f45033b, wm0Var3.d, 16));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vm0(this.f44055b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vm0(this.f44055b, tL_error, tLObject, 2));
                return;
        }
    }
}
