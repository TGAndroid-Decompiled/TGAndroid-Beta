package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zf1 implements Runnable {
    public final int f46283a;
    public final dg1 f46284b;
    public final TLRPC.TL_error f46285c;

    public zf1(dg1 dg1Var, TLRPC.TL_error tL_error, int i10) {
        this.f46283a = i10;
        this.f46284b = dg1Var;
        this.f46285c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f46283a;
        TLRPC.TL_error tL_error = this.f46285c;
        dg1 dg1Var = this.f46284b;
        switch (i10) {
            case 0:
                dg1Var.x0();
                if (tL_error == null) {
                    dg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new uf1(dg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.T = string;
                    e2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = dg1Var.showDialog(e2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    dg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    dg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                dg1Var.x0();
                if (tL_error == null) {
                    if (dg1Var.getParentActivity() != null) {
                        dg1Var.v0(new vf1(dg1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    dg1Var.z0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    dg1Var.H0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    dg1Var.H0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                dg1.f0(dg1Var, tL_error);
                return;
            default:
                dg1.a0(dg1Var, tL_error);
                return;
        }
    }
}
