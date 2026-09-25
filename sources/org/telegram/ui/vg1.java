package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vg1 implements Runnable {
    public final int f38717a;
    public final zg1 f38718b;
    public final TLRPC.TL_error f38719c;

    public vg1(zg1 zg1Var, TLRPC.TL_error tL_error, int i10) {
        this.f38717a = i10;
        this.f38718b = zg1Var;
        this.f38719c = tL_error;
    }

    @Override
    public final void run() {
        String formatPluralString;
        String formatPluralString2;
        int i10 = this.f38717a;
        TLRPC.TL_error tL_error = this.f38719c;
        zg1 zg1Var = this.f38718b;
        switch (i10) {
            case 0:
                zg1Var.w0();
                if (tL_error == null) {
                    zg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qg1(zg1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                    a2Var.T = string;
                    a2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog showDialog = zg1Var.showDialog(a2Var);
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
                    zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                    return;
                }
            case 1:
                zg1Var.w0();
                if (tL_error == null) {
                    if (zg1Var.getParentActivity() != null) {
                        zg1Var.u0(new rg1(zg1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    zg1Var.y0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue2 < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue2, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0]);
                    }
                    zg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    zg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 2:
                zg1.e0(zg1Var, tL_error);
                return;
            default:
                zg1.Z(zg1Var, tL_error);
                return;
        }
    }
}
