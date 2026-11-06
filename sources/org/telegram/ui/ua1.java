package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ua1 implements Runnable {
    public final int f50370a;
    public final ya1 f50371b;
    public final TLRPC.TL_error f50372c;

    public ua1(ya1 ya1Var, TLRPC.TL_error tL_error, int i7) {
        this.f50370a = i7;
        this.f50371b = ya1Var;
        this.f50372c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i7 = this.f50370a;
        TLRPC.TL_error tL_error = this.f50372c;
        ya1 ya1Var = this.f50371b;
        switch (i7) {
            case 0:
                ya1Var.B0();
                if (tL_error == null) {
                    ya1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ya1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new qa1(ya1Var, 3));
                    String M0 = org.telegram.messenger.hd.M0(2131747435, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.T = M0;
                    u1Var.R = org.telegram.messenger.hd.M0(2131743932, null);
                    Dialog showDialog = ya1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    ya1Var.L0(org.telegram.messenger.hd.M0(2131743932, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    ya1Var.L0(org.telegram.messenger.hd.M0(2131743932, null), tL_error.text);
                    return;
                }
            case 1:
                ya1Var.B0();
                if (tL_error == null) {
                    if (ya1Var.getParentActivity() != null) {
                        ya1Var.z0(new pa1(ya1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    ya1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    ya1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, G2));
                    return;
                } else {
                    ya1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                ya1.j0(ya1Var, tL_error);
                return;
            default:
                ya1.e0(ya1Var, tL_error);
                return;
        }
    }
}
