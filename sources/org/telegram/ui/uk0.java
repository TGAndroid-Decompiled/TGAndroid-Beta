package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class uk0 implements RequestDelegate {
    public final int f41964a;
    public final wk0 f41965b;

    public uk0(wk0 wk0Var, int i10) {
        this.f41964a = i10;
        this.f41965b = wk0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41964a) {
            case 0:
                org.telegram.messenger.i0.g3(new vk0(this.f41965b, tLObject, tL_error));
                return;
            case 1:
                final wk0 wk0Var = this.f41965b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                wk0 wk0Var2 = wk0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jl0 jl0Var = wk0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new uk0(wk0Var2, 4), 8);
                                    return;
                                }
                                if (jl0Var.D == null) {
                                    jl0Var.D = new TL_account.authorizationForm();
                                }
                                wk0Var2.a();
                                return;
                            default:
                                wk0 wk0Var3 = wk0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) wk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new uk0(wk0Var3, 3), 8);
                                    return;
                                }
                                Utilities.e.c(new pd0(wk0Var3, wk0Var3.f43126b, wk0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final wk0 wk0Var2 = this.f41965b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                wk0 wk0Var22 = wk0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jl0 jl0Var = wk0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new uk0(wk0Var22, 4), 8);
                                    return;
                                }
                                if (jl0Var.D == null) {
                                    jl0Var.D = new TL_account.authorizationForm();
                                }
                                wk0Var22.a();
                                return;
                            default:
                                wk0 wk0Var3 = wk0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) wk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new uk0(wk0Var3, 3), 8);
                                    return;
                                }
                                Utilities.e.c(new pd0(wk0Var3, wk0Var3.f43126b, wk0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.i0.g3(new vk0(this.f41965b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new vk0(this.f41965b, tL_error, tLObject, 2));
                return;
        }
    }
}
