package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wc0 implements Runnable {
    public final int f42755a = 1;
    public final ad0 f42756b;
    public final TLRPC.TL_error f42757c;
    public final String d;
    public final String e;
    public final TLObject f42758f;

    public wc0(ad0 ad0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f42756b = ad0Var;
        this.f42757c = tL_error;
        this.d = str;
        this.e = str2;
        this.f42758f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i10;
        int i11 = this.f42755a;
        TLObject tLObject = this.f42758f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f42757c;
        ad0 ad0Var = this.f42756b;
        switch (i11) {
            case 0:
                ad0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ad0Var.f35759s = password;
                    TwoStepVerificationActivity.r0(password);
                    ad0Var.n(str2, str);
                    return;
                }
                return;
            default:
                gf0 gf0Var = ad0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zc0(ad0Var, str2, str, 1), 8);
                    return;
                }
                gf0Var.t1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(20, ad0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    if (isEmpty) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131742824, null);
                    } else {
                        x1Var.T = org.telegram.messenger.dd.L0(2131742829, null);
                    }
                    x1Var.R = org.telegram.messenger.dd.L0(2131743956, null);
                    Dialog showDialog = gf0Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    ad0Var.f35761x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public wc0(ad0 ad0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f42756b = ad0Var;
        this.f42757c = tL_error;
        this.f42758f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
