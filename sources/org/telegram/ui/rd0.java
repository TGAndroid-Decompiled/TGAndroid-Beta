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
    public final int f42960a = 1;
    public final wd0 f42961b;
    public final TLRPC.TL_error f42962c;
    public final String d;
    public final String e;
    public final TLObject f42963f;

    public rd0(wd0 wd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f42961b = wd0Var;
        this.f42962c = tL_error;
        this.d = str;
        this.e = str2;
        this.f42963f = tLObject;
    }

    @Override
    public final void run() {
        String formatPluralString;
        int i10;
        int i11 = this.f42960a;
        TLObject tLObject = this.f42963f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f42962c;
        wd0 wd0Var = this.f42961b;
        switch (i11) {
            case 0:
                wd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    wd0Var.f44643s = password;
                    TwoStepVerificationActivity.n0(password);
                    wd0Var.n(str2, str);
                    return;
                }
                return;
            default:
                ig0 ig0Var = wd0Var.G;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ud0(wd0Var, str2, str, 1), 8);
                    return;
                }
                ig0Var.p1(false, true);
                if (tLObject instanceof TLRPC.auth_Authorization) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.voip.k1(27, wd0Var, tLObject));
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    if (isEmpty) {
                        e2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    e2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ig0Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    wd0Var.f44644w = false;
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    return;
                }
        }
    }

    public rd0(wd0 wd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f42961b = wd0Var;
        this.f42962c = tL_error;
        this.f42963f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
