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

public final class td0 implements Runnable {

    public final int f42905a = 1;

    public final yd0 f42906b;

    public final TLRPC.TL_error f42907c;
    public final String d;

    public final String f42908e;

    public final TLObject f42909f;

    public td0(yd0 yd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f42906b = yd0Var;
        this.f42907c = tL_error;
        this.d = str;
        this.f42908e = str2;
        this.f42909f = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f42905a;
        TLObject tLObject = this.f42909f;
        String str = this.f42908e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.f42907c;
        yd0 yd0Var = this.f42906b;
        switch (i10) {
            case 0:
                yd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    yd0Var.f44788s = password;
                    TwoStepVerificationActivity.m0(password);
                    yd0Var.o(str2, str);
                }
                break;
            default:
                ig0 ig0Var = yd0Var.A;
                int i11 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new wd0(yd0Var, str2, str, i11), 8);
                } else {
                    ig0Var.k1(false, true);
                    if (tLObject instanceof TLRPC.auth_Authorization) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new zr(25, yd0Var, tLObject));
                        boolean zIsEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        if (zIsEmpty) {
                            b2Var.P = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            b2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        b2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog dialogShowDialog = ig0Var.showDialog(b2Var);
                        if (dialogShowDialog != null) {
                            dialogShowDialog.setCanceledOnTouchOutside(false);
                            dialogShowDialog.setCancelable(false);
                        }
                    } else if (tL_error != null) {
                        yd0Var.f44789w = false;
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                        } else {
                            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        }
                    }
                }
                break;
        }
    }

    public td0(yd0 yd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f42906b = yd0Var;
        this.f42907c = tL_error;
        this.f42909f = tLObject;
        this.d = str;
        this.f42908e = str2;
    }
}
