package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wf1 implements Runnable {
    public final int f44121a;
    public final ag1 f44122b;
    public final TLRPC.TL_error f44123c;

    public wf1(ag1 ag1Var, TLRPC.TL_error tL_error, int i9) {
        this.f44121a = i9;
        this.f44122b = ag1Var;
        this.f44123c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i9 = this.f44121a;
        TLRPC.TL_error tL_error = this.f44123c;
        ag1 ag1Var = this.f44122b;
        switch (i9) {
            case 0:
                ag1Var.v0();
                if (tL_error == null) {
                    ag1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rf1(ag1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.P = string;
                    c2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = ag1Var.showDialog(c2Var);
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
                    ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                ag1Var.v0();
                if (tL_error == null) {
                    if (ag1Var.getParentActivity() != null) {
                        ag1Var.t0(new sf1(ag1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    ag1Var.x0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    ag1Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    ag1Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                ag1.d0(ag1Var, tL_error);
                return;
            default:
                ag1.Y(ag1Var, tL_error);
                return;
        }
    }
}
