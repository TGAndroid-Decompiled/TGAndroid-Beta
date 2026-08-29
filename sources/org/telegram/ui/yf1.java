package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yf1 implements Runnable {
    public final int f44862a;
    public final cg1 f44863b;
    public final TLRPC.TL_error f44864c;

    public yf1(cg1 cg1Var, TLRPC.TL_error tL_error, int i10) {
        this.f44862a = i10;
        this.f44863b = cg1Var;
        this.f44864c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f44862a;
        TLRPC.TL_error tL_error = this.f44864c;
        cg1 cg1Var = this.f44863b;
        switch (i10) {
            case 0:
                cg1Var.w0();
                if (tL_error == null) {
                    cg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new tf1(cg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.P = string;
                    c2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = cg1Var.showDialog(c2Var);
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
                    cg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    cg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                cg1Var.w0();
                if (tL_error == null) {
                    if (cg1Var.getParentActivity() != null) {
                        cg1Var.u0(new uf1(cg1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    cg1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    cg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    cg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                cg1.e0(cg1Var, tL_error);
                return;
            default:
                cg1.Z(cg1Var, tL_error);
                return;
        }
    }
}
