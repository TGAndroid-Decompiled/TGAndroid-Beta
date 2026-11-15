package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ta1 implements Runnable {
    public final int f51518a;
    public final xa1 f51519b;
    public final TLRPC.TL_error f51520c;

    public ta1(xa1 xa1Var, TLRPC.TL_error tL_error, int i7) {
        this.f51518a = i7;
        this.f51519b = xa1Var;
        this.f51520c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        int i7 = this.f51518a;
        TLRPC.TL_error tL_error = this.f51520c;
        xa1 xa1Var = this.f51519b;
        switch (i7) {
            case 0:
                xa1Var.B0();
                if (tL_error == null) {
                    xa1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new pa1(xa1Var, 3));
                    String M0 = org.telegram.messenger.hd.M0(2131747436, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.U = M0;
                    t1Var.S = org.telegram.messenger.hd.M0(2131743931, null);
                    Dialog showDialog = xa1Var.showDialog(t1Var);
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
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131743931, null), tL_error.text);
                    return;
                }
            case 1:
                xa1Var.B0();
                if (tL_error == null) {
                    if (xa1Var.getParentActivity() != null) {
                        xa1Var.z0(new oa1(xa1Var, 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    xa1Var.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = org.telegram.messenger.hd.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = org.telegram.messenger.hd.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G2));
                    return;
                } else {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                xa1.j0(xa1Var, tL_error);
                return;
            default:
                xa1.e0(xa1Var, tL_error);
                return;
        }
    }
}
