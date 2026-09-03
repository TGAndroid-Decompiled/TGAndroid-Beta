package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rg1 implements Runnable {
    public final int f40845a;
    public final vg1 f40846b;
    public final TLRPC.TL_error f40847c;

    public rg1(vg1 vg1Var, TLRPC.TL_error tL_error, int i10) {
        this.f40845a = i10;
        this.f40846b = vg1Var;
        this.f40847c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f40845a;
        TLRPC.TL_error tL_error = this.f40847c;
        vg1 vg1Var = this.f40846b;
        switch (i10) {
            case 0:
                vg1Var.w0();
                if (tL_error == null) {
                    vg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new mg1(vg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.Q = string;
                    d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = vg1Var.showDialog(d2Var);
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
                    vg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    vg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                vg1Var.w0();
                if (tL_error == null) {
                    if (vg1Var.getParentActivity() != null) {
                        vg1Var.u0(new ng1(vg1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    vg1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    vg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    vg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                vg1.e0(vg1Var, tL_error);
                return;
            default:
                vg1.Z(vg1Var, tL_error);
                return;
        }
    }
}
