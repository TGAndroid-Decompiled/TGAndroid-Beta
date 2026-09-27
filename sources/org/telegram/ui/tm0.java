package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tm0 implements RequestDelegate {
    public final int f37869a;
    public final vm0 f37870b;

    public tm0(vm0 vm0Var, int i10) {
        this.f37869a = i10;
        this.f37870b = vm0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37869a) {
            case 0:
                AndroidUtilities.runOnUIThread(new um0(this.f37870b, tLObject, tL_error));
                return;
            case 1:
                final vm0 vm0Var = this.f37870b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                vm0 vm0Var2 = vm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jn0 jn0Var = vm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new tm0(vm0Var2, 4), 8);
                                    return;
                                }
                                if (jn0Var.f34822y == null) {
                                    jn0Var.f34822y = new TL_account.authorizationForm();
                                }
                                vm0Var2.a();
                                return;
                            default:
                                vm0 vm0Var3 = vm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) vm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new tm0(vm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new mf0(vm0Var3, vm0Var3.f38641b, vm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final vm0 vm0Var2 = this.f37870b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                vm0 vm0Var22 = vm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jn0 jn0Var = vm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new tm0(vm0Var22, 4), 8);
                                    return;
                                }
                                if (jn0Var.f34822y == null) {
                                    jn0Var.f34822y = new TL_account.authorizationForm();
                                }
                                vm0Var22.a();
                                return;
                            default:
                                vm0 vm0Var3 = vm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) vm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new tm0(vm0Var3, 3), 8);
                                    return;
                                }
                                Utilities.globalQueue.postRunnable(new mf0(vm0Var3, vm0Var3.f38641b, vm0Var3.d, 12));
                                return;
                        }
                    }
                });
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new um0(this.f37870b, tL_error, tLObject, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new um0(this.f37870b, tL_error, tLObject, 2));
                return;
        }
    }
}
