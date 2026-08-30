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
public final class zd0 implements Runnable {
    public final int f40769a = 1;
    public final de0 f40770b;
    public final TLRPC.TL_error f40771c;
    public final String d;
    public final String e;
    public final TLObject f40772f;

    public zd0(de0 de0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f40770b = de0Var;
        this.f40771c = tL_error;
        this.d = str;
        this.e = str2;
        this.f40772f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f40769a;
        TLObject tLObject = this.f40772f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f40771c;
        de0 de0Var = this.f40770b;
        switch (i11) {
            case 0:
                de0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    de0Var.f33610s = password;
                    TwoStepVerificationActivity.m0(password);
                    de0Var.o(str2, str);
                    return;
                }
                return;
            default:
                ng0 ng0Var = de0Var.B;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ce0(de0Var, str2, str, 1), 8);
                    return;
                }
                ng0Var.k1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qs(24, de0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    if (isEmpty) {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ng0Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    de0Var.f33611w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public zd0(de0 de0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f40770b = de0Var;
        this.f40771c = tL_error;
        this.f40772f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
