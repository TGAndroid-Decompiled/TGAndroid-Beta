package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xc0 implements Runnable {
    public final int f43545a = 1;
    public final bd0 f43546b;
    public final TLRPC.TL_error f43547c;
    public final String d;
    public final String e;
    public final TLObject f43548f;

    public xc0(bd0 bd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f43546b = bd0Var;
        this.f43547c = tL_error;
        this.d = str;
        this.e = str2;
        this.f43548f = tLObject;
    }

    @Override
    public final void run() {
        String G;
        int i10;
        int i11 = this.f43545a;
        TLObject tLObject = this.f43548f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f43547c;
        bd0 bd0Var = this.f43546b;
        switch (i11) {
            case 0:
                bd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    bd0Var.f36182s = password;
                    TwoStepVerificationActivity.q0(password);
                    bd0Var.n(str2, str);
                    return;
                }
                return;
            default:
                hf0 hf0Var = bd0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ad0(bd0Var, str2, str, 1), 8);
                    return;
                }
                hf0Var.s1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(20, bd0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    if (isEmpty) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131742824, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131742829, null);
                    }
                    x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
                    Dialog showDialog = hf0Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    bd0Var.f36184x = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public xc0(bd0 bd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f43546b = bd0Var;
        this.f43547c = tL_error;
        this.f43548f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
