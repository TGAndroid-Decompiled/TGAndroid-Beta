package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class vf1 implements Runnable {

    public final int f43445a;

    public final zf1 f43446b;

    public final TLRPC.TL_error f43447c;

    public vf1(zf1 zf1Var, TLRPC.TL_error tL_error, int i10) {
        this.f43445a = i10;
        this.f43446b = zf1Var;
        this.f43447c = tL_error;
    }

    @Override
    public final void run() {
        int i10 = this.f43445a;
        TLRPC.TL_error tL_error = this.f43447c;
        zf1 zf1Var = this.f43446b;
        switch (i10) {
            case 0:
                zf1Var.w0();
                if (tL_error == null) {
                    zf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qf1(zf1Var, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.P = string;
                    b2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog dialogShowDialog = zf1Var.showDialog(b2Var);
                    if (dialogShowDialog != null) {
                        dialogShowDialog.setCanceledOnTouchOutside(false);
                        dialogShowDialog.setCancelable(false);
                    }
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                }
                break;
            case 1:
                zf1Var.w0();
                if (tL_error != null) {
                    if (tL_error.text.startsWith("CODE_INVALID")) {
                        zf1Var.y0();
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        zf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    } else {
                        int iIntValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        zf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                    }
                    break;
                } else if (zf1Var.getParentActivity() != null) {
                    zf1Var.u0(new rf1(zf1Var, 5));
                    break;
                }
                break;
            case 2:
                zf1.e0(zf1Var, tL_error);
                break;
            default:
                zf1.Z(zf1Var, tL_error);
                break;
        }
    }
}
