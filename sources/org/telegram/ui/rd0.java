package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rd0 implements Runnable {
    public final int f41129a = 1;
    public final wd0 f41130b;
    public final TLRPC.TL_error f41131c;
    public final String d;
    public final String e;
    public final TLObject f41132f;

    public rd0(wd0 wd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f41130b = wd0Var;
        this.f41131c = tL_error;
        this.d = str;
        this.e = str2;
        this.f41132f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f41129a;
        TLObject tLObject = this.f41132f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f41131c;
        wd0 wd0Var = this.f41130b;
        switch (i11) {
            case 0:
                wd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    wd0Var.f43002s = password;
                    TwoStepVerificationActivity.m0(password);
                    wd0Var.n(str2, str);
                    return;
                }
                return;
            default:
                hg0 hg0Var = wd0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ud0(wd0Var, str2, str, 1), 8);
                    return;
                }
                hg0Var.o1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ks(23, wd0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    if (isEmpty) {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    c2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = hg0Var.showDialog(c2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    wd0Var.f43003w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public rd0(wd0 wd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f41130b = wd0Var;
        this.f41131c = tL_error;
        this.f41132f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
